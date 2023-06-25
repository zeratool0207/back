package com.example.demo.controller;


import com.example.demo.service.AdvertisementService;
import com.example.demo.service.MainService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class AdvertisementController {

    private final AdvertisementService advertisementService;

    public AdvertisementController(AdvertisementService advertisementService) {
        this.advertisementService = advertisementService;
    }

    @GetMapping("/api/advertisement")
    public List<Map<String,Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = advertisementService.getList();
        System.out.println("this is list ::" + list);

        return list;
    }

}
