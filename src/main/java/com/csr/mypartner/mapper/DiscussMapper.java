package com.csr.mypartner.mapper;

import com.csr.mypartner.entity.Discuss;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DiscussMapper {

    @Insert("insert into discuss(argue) values (#{argue})")
    public int insertDiscuss(Discuss discuss);

    @Select("select * from discuss")
    List<Discuss> selectDiscussAll();

}
