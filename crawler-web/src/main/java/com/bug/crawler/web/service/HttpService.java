package com.bug.crawler.web.service;

import org.json.simple.JSONObject;

public interface HttpService {

    JSONObject doGet(String url);
}
