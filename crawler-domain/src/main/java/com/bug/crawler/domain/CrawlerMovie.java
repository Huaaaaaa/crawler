package com.bug.crawler.domain;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "crawler_movie", indexes = {@Index(name = "id", columnList = "id", unique = true)})
@Data
public class CrawlerMovie implements Serializable {

    /**
     * 主键：唯一索引
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 封面
     */
    private String cover;

    /**
     * 封面长度像素
     */
    private int coverX;

    /**
     * 封面宽度像素
     */
    private int coverY;

    /**
     * 是否新上映
     */
    private int isNew;

    /**
     * 是否可播放
     */
    private int playable;

    /**
     * 评分
     */
    private String rate;

    /**
     * 电影名称
     */
    private String title;

    /**
     * 电影链接
     */
    private String url;

}
