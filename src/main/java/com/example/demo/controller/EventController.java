package com.example.demo.controller;

import com.example.demo.service.EventService;
import com.example.demo.service.MainService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @GetMapping("/api/event")
    public List<Map<String,Object>> getList() {
        List<Map<String, Object>> list = new ArrayList<>();

        list = eventService.getList();
        System.out.println("this is list ::" + list);

        return list;
    }
}
