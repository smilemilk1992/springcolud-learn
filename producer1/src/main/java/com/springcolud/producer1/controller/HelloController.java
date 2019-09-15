package com.springcolud.producer1.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author haochen
 * @date 2019/9/11 16:17
 */
@RestController
//@EnableDiscoveryClient
public class HelloController {

    @Autowired
    private PoidTimeMapper poidTimeMapper;

    @RequestMapping("/hello1/{name}")
    public String index(@PathVariable("name") String name) {
        return "hello1  ，" +name;
    }

    @RequestMapping(value = "/getInfo1")
    public String oidGetNidList1(HttpServletRequest request){
        String id = request.getParameter("id");
        PoidTime poidTime=poidTimeMapper.selectByPrimaryKey(Integer.valueOf(id));
        return JSON.toJSONString(poidTime);
    }

    @RequestMapping(value = "/getInfo")
    public String oidGetNidList(@RequestParam(value = "id") String id){
        PoidTime poidTime=poidTimeMapper.selectByPrimaryKey(Integer.valueOf(id));
        return JSON.toJSONString(poidTime);
    }
}
