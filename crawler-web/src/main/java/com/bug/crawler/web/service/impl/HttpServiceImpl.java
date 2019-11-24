package com.bug.crawler.web.service.impl;

import com.bug.crawler.web.service.HttpService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpServiceImpl implements HttpService {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public JSONObject doGet(String url) {
        JSONObject jsonObject = restTemplate.getForObject(url, JSONObject.class);
        return jsonObject;
    }
}
