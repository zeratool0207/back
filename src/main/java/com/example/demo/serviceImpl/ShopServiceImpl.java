package com.example.demo.serviceImpl;

import com.example.demo.mapper.ShopMapper;
import com.example.demo.service.ShopService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ShopServiceImpl implements ShopService {

    private final ShopMapper shopMapper;

    public ShopServiceImpl(ShopMapper shopMapper) {
        this.shopMapper = shopMapper;
    }

    @Override
    public List<Map<String, Object>> getList() {
        return null;
    }
}
