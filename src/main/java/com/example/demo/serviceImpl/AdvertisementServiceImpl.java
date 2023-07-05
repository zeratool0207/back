package com.example.demo.serviceImpl;

import com.example.demo.mapper.AdvertisementMapper;
import com.example.demo.mapper.MainMapper;
import com.example.demo.service.AdvertisementService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AdvertisementServiceImpl implements AdvertisementService {

    private final AdvertisementMapper advertisementMapper;

    public AdvertisementServiceImpl(AdvertisementMapper advertisementMapper) {
        this.advertisementMapper = advertisementMapper;
    }

    @Override
    public List<Map<String, Object>> getAdvertisementList() {
        return advertisementMapper.getAdvertisementList();
    }
}
