package com.example.demo.serviceImpl;

import com.example.demo.mapper.TestMapper;
import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    public TestServiceImpl(TestMapper testMapper) {
        this.testMapper = testMapper;
    }

    @Override
    public List<Map<String, Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<>();
        list = testMapper.getList();
        return list;
    }

    @Override
    public String getTest() {
        return "test-view";
    }


}
