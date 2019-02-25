package com.elastic.test.repository;

import com.elastic.test.entity.GoodsInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

/**
 *
 */
@Component
public interface GoodsRepository extends ElasticsearchRepository<GoodsInfo,Long> {
    //GoodsInfo findOne(long id);
}
