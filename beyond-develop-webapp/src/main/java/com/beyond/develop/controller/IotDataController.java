package com.beyond.develop.controller;



import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.beyond.develop.dto.CMDDataDto;
import com.beyond.develop.dto.PGDataDto;
import com.beyond.develop.dto.PHDataDto;
import com.beyond.develop.dto.PLDataDto;
import com.beyond.develop.service.PGService;
import com.qdigo.iotsdk.dto.pg.PGPacketDto;


@Controller
public class IotDataController {
	public static void main(String[] args) {
		PGDataDto pgDataDto = new PGDataDto();
		sendPgData(pgDataDto, null);
	}
	private Logger logger = LoggerFactory.getLogger(IotDataController.class);
//	@Autowired
//	public PGService pgService;
	@RequestMapping(value="/iotCMD")
	public String easyuiTree(){
		return "cmd";
	}
	
	@RequestMapping(value = "/pgData")
	public @ResponseBody static String sendPgData(@ModelAttribute PGDataDto pgDataDto,HttpServletResponse response){
		try {
			System.out.println(pgDataDto.toString());
//			response.setContentType("text/html;charset=utf-8");
			PGService pgService = new PGService();
			PGPacketDto pgPacketDto = pgService.buildPgPacketDto(pgDataDto);
			pgService.sendPGData(pgPacketDto);
		} catch (Exception e) {
			e.printStackTrace();
			return "false";
		}
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
