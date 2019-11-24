package com.bug.crawler.web.service.impl;

import com.bug.crawler.dao.CrawlerMovieDao;
import com.bug.crawler.domain.CrawlerMovie;
import com.bug.crawler.web.service.CrawlerMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrawlerMovieServiceImpl implements CrawlerMovieService {


    @Autowired
    private CrawlerMovieDao crawlerMovieDao;

    /**
     * 获取电影列表
     *
     * @return
     */
    @Override
    public List<CrawlerMovie> getAllMovies() {
        return crawlerMovieDao.findAll();
    }
}
