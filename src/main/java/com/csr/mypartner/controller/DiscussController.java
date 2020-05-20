package com.csr.mypartner.controller;

import com.alibaba.fastjson.JSONObject;
import com.csr.mypartner.entity.Discuss;
import com.csr.mypartner.service.DiscussService;
import com.csr.mypartner.entity.Discuss;
import com.csr.mypartner.service.DiscussService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
@ResponseBody
@CrossOrigin
public class DiscussController {

   @Autowired
   private DiscussService discussService;

    /**
     *评论功能
     */
    @PostMapping("/insertDiscuss")
    public String insertDiscuss(@RequestBody Discuss discuss, HttpSession session,
                                HttpServletResponse response){
        JSONObject data = new JSONObject();
        discussService.insertDiscuss(discuss);
        if(discuss!=null){
            session.setAttribute("discuss", discuss);
            data.put("result","success");
         }else{
            data.put("result","false");
        }
        return data.toJSONString();
    }

    /**
     *查看评论功能
     */
    @GetMapping("/selectDiscussAll")
    public List<Discuss>selectDiscussAll(){
        List<Discuss>discusses = discussService.selectDiscussAll();
        return discusses;
    }
}
