package com.example.demo.controller;

import com.example.demo.service.MainService;
import com.example.demo.service.NewsNotiService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class NewsNotiController {

    private final NewsNotiService newsNotiService;

    public NewsNotiController(NewsNotiService newsNotiService) {
        this.newsNotiService = newsNotiService;
    }

    @GetMapping("/api/news")
    public List<Map<String,Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = newsNotiService.getList();
        System.out.println("this is list ::" + list);

        return list;
    }
}
