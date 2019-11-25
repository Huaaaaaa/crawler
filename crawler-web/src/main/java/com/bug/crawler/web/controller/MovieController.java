package com.bug.crawler.web.controller;

import com.bug.crawler.domain.CrawlerMovie;
import com.bug.crawler.domain.request.CreateDataRequest;
import com.bug.crawler.web.service.CrawlerMovieService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/movie")
public class MovieController {

    private static final Logger logger = LoggerFactory.getLogger(MovieController.class);

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


    @ResponseBody
    @RequestMapping(value = "/creteMovies", name = "creteMovies", method = RequestMethod.GET)
    public int creteMovies(CreateDataRequest<CrawlerMovie> createDataRequest) {
        logger.info("creteMovies begin:createDataRequest={}", createDataRequest);
        int res = crawlerMovieService.createMovie(createDataRequest.getList());
        logger.info("creteMovies end:res={}", res);
        return res;
    }


}
