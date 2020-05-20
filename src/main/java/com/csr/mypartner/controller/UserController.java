package com.csr.mypartner.controller;

import com.alibaba.fastjson.JSONObject;
import com.csr.mypartner.entity.User;
import com.csr.mypartner.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    private Logger logger = LoggerFactory.getLogger(getClass());

//    @RequestMapping({"/", "/login.html"})
//    public String login (){
//        return "login";
//    }

    /**
     *
     * 跳转到注册页面
     */
    @GetMapping("/reg")
    public String regUser(){
        return "/register";
    }

    @GetMapping("/log")
    public String logUser(){
        return "/login";
    }

    @GetMapping("/main")
    public String main(){
        return "/main";
    }
    @GetMapping("/memory")
    public String memory(){
        return "/memory";
    }
    @GetMapping("/music")
    public String music(){
        return "/music";
    }
    @GetMapping("/myself")
    public String myself(){
        return "/myself";
    }

    /**
     *    登录功能
     */
    @PostMapping("/login")
    @ResponseBody
    public String findUser(@RequestBody User user, HttpSession session,
                           HttpServletResponse response, HttpServletRequest request) {
        JSONObject data = new JSONObject();
        User finduser = userService.findUser(user.getUsername(), user.getPassword());
        if(finduser != null){
            session.setAttribute("user", finduser);
            data.put("result","success");
        }else {
            data.put("result","false");
        }
        return data.toJSONString();
    }

    @GetMapping("/getUser")
    public User getUser(HttpSession session) {
        System.out.println( session.getId());
        return (User) session.getAttribute("user");
    }

    /**
     *    注册功能
     */
    @PostMapping("/insertUser")
    public String insertUser(User user,HttpServletRequest request,
                           HttpServletResponse response) throws ServletException,IOException{
        if (user !=null){
            userService.insertUser(user);
            System.out.println("添加成功");
            return "login.html";
        } else {
           return "login.html";
        }
    }
}
