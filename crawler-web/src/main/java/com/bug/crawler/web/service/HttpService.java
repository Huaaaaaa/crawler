package com.bug.crawler.web.service;

import org.json.simple.JSONObject;

import java.util.Map;

public interface HttpService {

    JSONObject doGet(String url, Map<String, Object> paramMap);


}
