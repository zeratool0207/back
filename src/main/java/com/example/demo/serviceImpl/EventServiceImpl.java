package com.example.demo.serviceImpl;

import com.example.demo.mapper.EventMapper;
import com.example.demo.mapper.MainMapper;
import com.example.demo.service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class EventServiceImpl implements EventService {
    private final EventMapper eventMapper;

    public EventServiceImpl(EventMapper eventMapper) {
        this.eventMapper = eventMapper;
    }


    @Override
    public List<Map<String, Object>> getList() {
        return eventMapper.getList();
    }
}
