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
		return userInfoService.getUserInfoById(new Long(1));
	}
}
