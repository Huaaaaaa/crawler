package com.bug.crawler.dao;

import com.bug.crawler.domain.CrawlerMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlerMovieDao extends JpaRepository<CrawlerMovie, Long> {
}
