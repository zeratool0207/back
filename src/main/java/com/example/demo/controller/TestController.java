package com.example.demo.controller;

import com.example.demo.service.TestService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/api/list")
    public List<Map<String,Object>> getList(HttpServletRequest request) {
        List<Map<String, Object>> list = new ArrayList<>();
        System.out.println(request.getRequestURI());

        list = testService.getList();
        System.out.println("this is list ::" + list);

        return list;
    }

    @GetMapping("/api/test")
    public String getTest() {
        String tst = "" ;
        tst = testService.getTest();
        return tst;
    }


}
