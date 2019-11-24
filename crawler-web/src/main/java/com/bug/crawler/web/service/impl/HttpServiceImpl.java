package com.bug.crawler.web.service.impl;

import com.bug.crawler.web.service.HttpService;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Service
public class HttpServiceImpl implements HttpService {


    @Autowired
    private RestTemplate restTemplate;

    @Override
    public JSONObject doGet(String url, Map<String, Object> paramMap) {
        JSONObject jsonObject = null;
        if (paramMap != null && paramMap.size() > 0) {
            jsonObject = restTemplate.getForObject(url, JSONObject.class, paramMap);
        } else {
            jsonObject = restTemplate.getForObject(url, JSONObject.class);
        }

        return jsonObject;
    }

}
