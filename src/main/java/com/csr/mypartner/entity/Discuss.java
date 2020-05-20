package com.csr.mypartner.entity;

import javax.persistence.Table;

@Table(name = "discuss")
public class Discuss {
    private Integer id;
    private String argue;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getArgue() {
        return argue;
    }

    public void setArgue(String argue) {
        this.argue = argue;
    }
}
