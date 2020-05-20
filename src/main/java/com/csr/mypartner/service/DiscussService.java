package com.csr.mypartner.service;


import com.csr.mypartner.entity.Discuss;

import java.util.List;

public interface DiscussService {
    int insertDiscuss(Discuss discuss);

    List<Discuss> selectDiscussAll();
}
