package com.example.demo.serviceImpl;

import com.example.demo.mapper.NewsNotiMapper;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.service.NewsNotiService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class NewsNotiServiceImpl implements NewsNotiService {

    private final NewsNotiMapper newsNotiMapper;

    public NewsNotiServiceImpl(NewsNotiMapper newsNotiMapper) {
        this.newsNotiMapper = newsNotiMapper;
    }

    @Override
    public List<Map<String, Object>> getList() {
        return null;
    }
}
