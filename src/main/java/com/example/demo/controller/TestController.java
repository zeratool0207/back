package com.example.demo.controller;

import com.example.demo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/api/list")
    public List<Map<String,Object>> getList() {
        System.out.println("Controller 진입 ");
        List<Map<String, Object>> list = new ArrayList<>();
        list = testService.getList();
        System.out.println("this is list ::" + list);
        System.out.println("퇴거");

        return list;
    }

    @GetMapping("/api/test")
    public String getTest() {
        String tst = "" ;
        System.out.println("this is before tst:" + tst);

        tst = testService.getTest();
        System.out.println("this is after tst:" + tst);
        return tst;
    }


}
