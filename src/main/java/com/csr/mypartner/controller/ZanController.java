package com.csr.mypartner.controller;

import com.csr.mypartner.entity.User;
import com.csr.mypartner.service.ZanService;
import com.csr.mypartner.service.ZanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class ZanController{

    @Autowired
    private ZanService zanService;

    /**
     *点赞功能，根据登录的用户名，同一个用户点赞一次，赞的总数+1，用户点赞第二次，赞的总数-1。
     * 通过点赞一次添加当前用户名进去点赞表，点赞第二次用户名从点赞表中删除，
     * 最后统计点赞表里面有多少个用户名进行赞的总数统计
     */
    @GetMapping("/findUser")
    public String findUser(HttpSession session){
        User user = (User) session.getAttribute("user");
        if(zanService.findUser(user.getUsername()) != null){
            return "success";
        } else {
            return "false";
        }
    }
    @GetMapping("/addUser")
    public Integer addUser(HttpSession session){
        User user = (User) session.getAttribute("user");
        return zanService.addUser(user.getUsername());
    }
    @GetMapping("/deleteUser")
    public Integer deleteUser(HttpSession session){
        User user = (User) session.getAttribute("user");
        return zanService.deleteUser(user.getUsername());
    }
    @GetMapping("/getCount")
    public Integer getCount(){
        return zanService.getCount();
    }

}
