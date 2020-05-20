package com.csr.mypartner.mapper;

import com.csr.mypartner.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    @Select("select * from user where username = #{username} and password = #{password}")
    public User findUser(@Param("username") String username, @Param("password") String password);

    @Insert("insert into user(username,password) values (#{username},#{password})")
    public int insertUser(User user);
}
