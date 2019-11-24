package com.bug.crawler.web.service.impl;

import com.bug.crawler.dao.CrawlerMovieDao;
import com.bug.crawler.domain.CrawlerMovie;
import com.bug.crawler.web.service.CrawlerMovieService;
import com.bug.crawler.web.service.HttpService;
import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CrawlerMovieServiceImpl implements CrawlerMovieService {

    private static final Logger logger = LoggerFactory.getLogger(CrawlerMovieServiceImpl.class);


    @Autowired
    private CrawlerMovieDao crawlerMovieDao;

    @Autowired
    private HttpService httpService;

    /**
     * 获取电影列表
     *
     * @return
     */
    @Override
    public List<CrawlerMovie> getAllMovies() {
        return crawlerMovieDao.findAll();
    }

    @Override
    public List<CrawlerMovie> crawlMovies(String url, Map<String, Object> paramMap) {
        logger.info("crawlMovies begin:url={},paramMap={}", url, paramMap);
        JSONObject jsonObject = httpService.doGet(url, paramMap);
        List<CrawlerMovie> crawlerMovieList = (List<CrawlerMovie>) jsonObject.get("subjects");
        logger.info("crawlMovies end:jsonObject={}", jsonObject);
        return crawlerMovieList;
    }
}
