package com.beyond.develop.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beyond.develop.dto.PGDataDto;

@Controller
public class TestSpringBoot {
	@RequestMapping(value="/index")
	public String testSpringBoot(){
		return "test";
	}
	
	@RequestMapping(value="/demo")
	public String testSpringmvc(){
		return "demo";
	}
	
	@RequestMapping(value="/iotCmd")
	public String easyuiTree(){
		return "cmd";
	}
	@RequestMapping(value = "/pgCMD")
	public @ResponseBody String pgCmd(@ModelAttribute PGDataDto pgcmdParamDto,HttpServletResponse response){
		System.out.println(pgcmdParamDto.toString());
		response.setContentType("text/html;charset=utf-8");
		return "success";
	}
	
	@RequestMapping("login") //用来处理前台的login请求  
    private @ResponseBody String hello(  
            @RequestParam(value = "username", required = false)String username,  
            @RequestParam(value = "password", required = false)String password  
            ){  
        return "Hello "+username+",Your password is: "+password;  
          
    }  
}
