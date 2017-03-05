package com.beyond.develop.controller;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beyond.develop.dto.CMDDataDto;
import com.beyond.develop.dto.PGDataDto;
import com.beyond.develop.dto.PHDataDto;
import com.beyond.develop.dto.PLDataDto;

@Controller
public class IotDataController {
	
	@RequestMapping(value="/iotCMD")
	public String easyuiTree(){
		return "cmd";
	}
	
	@RequestMapping(value = "/pgData")
	public @ResponseBody String sendPgData(@ModelAttribute PGDataDto pgDataDto,HttpServletResponse response){
		System.out.println(pgDataDto.toString());
		response.setContentType("text/html;charset=utf-8");
		return "success";
	}

	@RequestMapping(value = "/plData")
	public @ResponseBody String sendPlData(@ModelAttribute PLDataDto plDataDto,HttpServletResponse response){
		System.out.println(plDataDto.toString());
		response.setContentType("text/html;charset=utf-8");
		return "success";
	}

	@RequestMapping(value = "/phData")
	public @ResponseBody String sendPhData(@ModelAttribute PHDataDto phDataDto,HttpServletResponse response){
		System.out.println(phDataDto.toString());
		response.setContentType("text/html;charset=utf-8");
		return "success";
	}

	@RequestMapping(value = "/cmdData")
	public @ResponseBody String sendCmdData(@ModelAttribute CMDDataDto cmdDataDto,HttpServletResponse response){
		System.out.println(cmdDataDto.toString());
		response.setContentType("text/html;charset=utf-8");
		return "success";
	}
	
	
}
