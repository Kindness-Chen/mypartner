package com.csr.mypartner.service.serviceimpl;

import com.csr.mypartner.entity.Discuss;
import com.csr.mypartner.mapper.DiscussMapper;
import com.csr.mypartner.service.DiscussService;
import com.csr.mypartner.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("discussService")
public class DiscussServiceImpl implements DiscussService {

    @Autowired
    private DiscussMapper discussMapper;


    public int insertDiscuss(Discuss discuss){
        return discussMapper.insertDiscuss(discuss);
    }

    public List<Discuss>selectDiscussAll(){
        return discussMapper.selectDiscussAll();
    }
}
