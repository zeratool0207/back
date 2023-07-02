package com.example.demo.serviceImpl;

import com.example.demo.mapper.MainMapper;
import com.example.demo.mapper.TestMapper;
import com.example.demo.service.MainService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class MainServiceImpl implements MainService {

    private final MainMapper mainMapper;

    public MainServiceImpl(MainMapper mainMapper) {
        this.mainMapper = mainMapper;
    }


    @Override
    public List<Map<String, Object>> getMenuList() {
        return mainMapper.getMenuList();
    }
}
