package com.csr.mypartner.service.serviceimpl;

import com.csr.mypartner.entity.User;
import com.csr.mypartner.mapper.UserMapper;
import com.csr.mypartner.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUser(String username, String password){
     return userMapper.findUser(username,password);
    }

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }
}
