package com.elastic.test.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@Document(indexName = "testgoods",type = "goods")
public class GoodsInfo implements Serializable {

    private static final long serialVersionUID = -2393196660834584539L;

    private Long id;

    private String name;

    private String description;
}
