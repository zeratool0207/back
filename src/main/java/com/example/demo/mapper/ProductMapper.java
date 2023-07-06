package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ProductMapper {

    List<Map<String, Object>> getProductList(String men_cate_id);

    List<Map<String, Object>> getProductCateList(String pro_cate_id);

    Map<String, Object> getProductDetail(int pro_id);

}
