package com.example.demo.serviceImpl;

import com.example.demo.mapper.MainMapper;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductMapper productMapper;

    public ProductServiceImpl(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }

    @Override
    public List<Map<String, Object>> getProductList(String men_cate_id) {
        return productMapper.getProductList(men_cate_id);
    }

    @Override
    public List<Map<String, Object>> getProductCateList(String pro_cate_id) {
        return productMapper.getProductCateList(pro_cate_id);
    }

    @Override
    public Map<String, Object> getProductDetail(int pro_id) {
        return productMapper.getProductDetail(pro_id);
    }


}
