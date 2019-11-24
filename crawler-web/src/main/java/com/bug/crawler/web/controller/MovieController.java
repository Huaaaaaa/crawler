package com.bug.crawler.web.controller;

import com.bug.crawler.domain.CrawlerMovie;
import com.bug.crawler.web.service.CrawlerMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private CrawlerMovieService crawlerMovieService;


    @ResponseBody
    @RequestMapping(value = "/list", name = "list", method = RequestMethod.GET)
    public List<CrawlerMovie> getAllMovies() {
        return crawlerMovieService.getAllMovies();
    }

    @ResponseBody
    @RequestMapping(value = "/crawlMovieList", name = "crawlMovieList", method = RequestMethod.GET)
    public List<CrawlerMovie> crawlerMovieList() {
        String url = "https://movie.douban.com/j/search_subjects?type=movie&tag=&page_limit=50&page_start=0";
//        Map<String, Object> paramMap = new HashMap<>();
//        paramMap.put("type", "movie");
//        paramMap.put("tag", "");
//        paramMap.put("page_start", 0);
//        paramMap.put("page_limit", 20);
        return crawlerMovieService.crawlMovies(url, null);
    }


}
