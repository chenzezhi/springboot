package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class UserInfoController
{
	@Autowired
	private UserInfoService userInfoService;
	@GetMapping("/getuserinfo")
	public UserInfo getInfo()
	{
		UserInfo ui = userInfoService.getUserInfoByName("张三");
		//userInfoService.addSkills(ui,"JavaScript");
		return ui==null ? userInfoService.addUserInfo() : ui ;
		
	}
}
