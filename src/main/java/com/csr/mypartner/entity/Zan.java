package com.csr.mypartner.entity;

import javax.persistence.Table;

@Table(name = "zan")
public class Zan {
    private Integer id;
    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
