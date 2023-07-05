package com.example.demo.controller;

import com.example.demo.service.MainService;
import com.example.demo.service.TestService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MainController {

    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/api/menu/list")
    public List<Map<String, List<Map<String, Object>>>> getMenuList() {
        List<Map<String, List<Map<String, Object>>>> list = new ArrayList<>();

        List<Map<String, Object>> menuList = new ArrayList<>();
        List<Map<String, Object>> productList = new ArrayList<>();
        List<Map<String, Object>> newsList = new ArrayList<>();

        menuList = mainService.getMenuList();
        productList = mainService.getProductList();
        newsList = mainService.getNewsList();

        Map<String, List<Map<String, Object>>> listWithName = new HashMap<>();
        listWithName.put("menuList",menuList);
        listWithName.put("productList",productList);
        listWithName.put("newsList",newsList);

        list.add(listWithName);

        return list;
    }



    // backup

//    @GetMapping("/api/menu/list")
//    public List<List<Map<String,Object>>> getMenuList() {
//        List<List<Map<String,Object>>> list = new ArrayList<>();
//
//        List<Map<String, Object>> menuList = new ArrayList<>();
//        List<Map<String, Object>> productList = new ArrayList<>();
//        List<Map<String, Object>> newsList = new ArrayList<>();
//
////        list = mainService.getMenuList();
//        menuList = mainService.getMenuList();
//        productList = mainService.getProductList();
//        newsList = mainService.getNewsList();
//
//        System.out.println("this is list ::" + list);
//        System.out.println("this is menuList ::" + menuList);
//        System.out.println("this is productList ::" + productList);
//        System.out.println("this is newsList ::" + newsList);
//
//        list.add(menuList);
//        list.add(productList);
//        list.add(newsList);
//
//        System.out.println("this is list ::" + list);
//
//        return list;
//    }



}
