package com.bug.crawler.domain.request;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CreateDataRequest<T> implements Serializable {

    private List<T> list;


    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
