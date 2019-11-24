package com.bug.crawler.web.service;

import com.bug.crawler.domain.CrawlerMovie;

import java.util.List;
import java.util.Map;

public interface CrawlerMovieService {


    List<CrawlerMovie> getAllMovies();

    List<CrawlerMovie> crawlMovies(String url, Map<String, Object> paramMap);
}
