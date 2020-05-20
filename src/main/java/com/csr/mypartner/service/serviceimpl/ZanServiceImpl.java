package com.csr.mypartner.service.serviceimpl;

import com.csr.mypartner.entity.User;
import com.csr.mypartner.mapper.ZanMapper;
import com.csr.mypartner.service.ZanService;
import com.csr.mypartner.service.ZanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("zanService")
public class ZanServiceImpl implements ZanService {

    @Autowired
    private ZanMapper zanMapper;


    @Override
    public User findUser(String username) {
        return zanMapper.findUser(username);
    }

    @Override
    public int addUser(String username) {
        return zanMapper.addUser(username);
    }

    @Override
    public int deleteUser(String username) {
        return zanMapper.deleteUser(username);
    }

    @Override
    public int getCount() {
        return zanMapper.getCount();
    }
}
