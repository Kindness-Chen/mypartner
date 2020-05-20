package com.csr.mypartner.service;

import com.csr.mypartner.entity.User;

public interface ZanService {
    User findUser(String username);

    int addUser(String username);

    int deleteUser(String username);

    int getCount();
}
