package com.bug.crawler.web.controller;

import com.bug.crawler.domain.CrawlerMovie;
import com.bug.crawler.web.service.CrawlerMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/movie")
public class MovieController {

    @Autowired
    private CrawlerMovieService crawlerMovieService;


    @ResponseBody
    @RequestMapping(value = "/list", name = "/list", method = RequestMethod.GET)
    public List<CrawlerMovie> getAllMovies() {
        return crawlerMovieService.getAllMovies();
    }

}
