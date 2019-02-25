package com.elastic.test.controller;

import com.elastic.test.constants.ConstantsUtils;
import com.elastic.test.entity.GoodsInfo;
import com.elastic.test.repository.GoodsRepository;
import io.swagger.annotations.Api;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.functionscore.FunctionScoreQueryBuilder;
import org.elasticsearch.index.query.functionscore.ScoreFunctionBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Api(value="/GoodsController",tags={"elastic测试接口"})
public class GoodsController {

    @Autowired
    private GoodsRepository goodsRepository;

    //http://localhost:8888/getOne?id=1525417362754
    @GetMapping("/getOne")
    public Optional<GoodsInfo> getOne(@RequestParam long id){
        Optional<GoodsInfo> goodsInfo = goodsRepository.findById(id);
        return goodsInfo;
    }

    @GetMapping("/save")
    public String save(){
        GoodsInfo goodsInfo = new GoodsInfo();
        goodsInfo.setId(System.currentTimeMillis());
        goodsInfo.setDescription("商品" + System.currentTimeMillis());
        goodsInfo.setName("这是一个测试商品");
        goodsRepository.save(goodsInfo);
        return "success";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam long id){
        goodsRepository.deleteById(id);
        return "success";
    }

    @PostMapping("/update")
    public String update(@RequestBody GoodsInfo goodsInfo){
        goodsRepository.save(goodsInfo);
        return "success";
    }

    @GetMapping("/getGoodsList")
    public List<GoodsInfo> getList(@RequestParam Integer pageNumber, @RequestParam String query){
        if(pageNumber==null) pageNumber = 0;
        //es搜索默认第一页页码是0
        SearchQuery searchQuery=getEntitySearchQuery(pageNumber,ConstantsUtils.PAGESIZE,query);
        Page<GoodsInfo> goodsPage = goodsRepository.search(searchQuery);
        return goodsPage.getContent();
    }

    private SearchQuery getEntitySearchQuery(int pageNumber, int pageSize, String searchContent) {
        FunctionScoreQueryBuilder functionScoreQueryBuilder = QueryBuilders.functionScoreQuery()
                .add(QueryBuilders.matchPhraseQuery("name", searchContent),
                        ScoreFunctionBuilders.weightFactorFunction(100))
                .add(QueryBuilders.matchPhraseQuery("description", searchContent),
                        ScoreFunctionBuilders.weightFactorFunction(100))
                //设置权重分 求和模式
                .scoreMode("sum")
                //设置权重分最低分
                .setMinScore(10);

        // 设置分页
        Pageable pageable = new PageRequest();
        return new NativeSearchQueryBuilder()
                .withPageable(pageable)
                .withQuery(functionScoreQueryBuilder).build();
    }
}
