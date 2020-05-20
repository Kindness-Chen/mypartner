package com.csr.mypartner.mapper;

import com.csr.mypartner.entity.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ZanMapper {
    @Select("select * from zan where username = #{username}")
    User findUser(String username);

    @Insert("insert into zan(username) values (#{username})")
    int addUser(String username);

    @Delete("delete from zan where username = #{username}")
    int deleteUser(String username);

    @Select("select COUNT(*) from zan")
    int getCount();
}
