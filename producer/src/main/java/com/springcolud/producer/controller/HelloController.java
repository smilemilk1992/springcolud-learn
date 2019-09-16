package com.springcolud.producer.controller;

import com.alibaba.fastjson.JSON;
import com.springcolud.producer.Mapper.PoidTimeMapper;
import com.springcolud.producer.Model.PoidTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @RequestParam注解是获取静态URL传入的参数
 *
 * @PathVariable是获取请求路径中的变量作为参数
 * @author haochen
 * @date 2019/9/11 16:17
 */
@RestController
public class HelloController {
    @Autowired
    private PoidTimeMapper poidTimeMapper;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable( "name") String name) {
        return "hello  ，" +name;
    }

    @RequestMapping(value = "/getInfo")
    public String oidGetNidList1(HttpServletRequest request){
        System.out.println("----9003-----");
        String id = request.getParameter("id");
        PoidTime poidTime=poidTimeMapper.selectByPrimaryKey(Integer.valueOf(id));
        return JSON.toJSONString(poidTime);
    }
}
