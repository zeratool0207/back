package com.example.demo.serviceImpl;

import com.example.demo.mapper.ShopMapper;
import com.example.demo.mapper.SubstituentMapper;
import com.example.demo.service.SubstituentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SubstituentServiceImpl implements SubstituentService {

    private final SubstituentMapper substituentMapper;

    public SubstituentServiceImpl(SubstituentMapper substituentMapper) {
        this.substituentMapper = substituentMapper;
    }


    @Override
    public List<Map<String, Object>> getSubstituentList() {
        return substituentMapper.substituentMapper();
    }
}
