package com.example.demo.serviceImpl;


import com.example.demo.mapper.EventMapper;
import com.example.demo.mapper.FaqMapper;
import com.example.demo.service.FaqService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class FaqServiceImpl implements FaqService {

    private final FaqMapper faqMapper;

    public FaqServiceImpl(FaqMapper faqMapper) {
        this.faqMapper = faqMapper;
    }

    @Override
    public List<Map<String, Object>> getFaqList() {
        return faqMapper.getFaqList();
    }
}
