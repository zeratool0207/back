package com.example.demo.service;

import java.util.List;
import java.util.Map;

public interface ProductService {

    List<Map<String,Object>> getProductList(String men_cate_id);

    List<Map<String,Object>> getProductCateList(String pro_cate_id);

    Map<String,Object> getProductDetail(int pro_id);
}
