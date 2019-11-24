package com.bug.crawler.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.bug.crawler")
@EnableJpaRepositories("com.bug.crawler.dao")
@EntityScan("com.bug.crawler.domain")
public class CrawlerWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrawlerWebApplication.class, args);
    }

}
