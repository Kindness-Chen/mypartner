package com.csr.mypartner.service;

import com.csr.mypartner.entity.User;

public interface UserService {
    User findUser(String username, String password);

    int insertUser(User user);
}
