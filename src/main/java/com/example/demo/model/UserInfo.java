package com.example.demo.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class UserInfo
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//简历姓名
	private String name;
	//应聘岗位
	private String post;
	//头像
	private String avatar;
	//个人简介
	private String intro;
	//已掌握的技能或工具
	@ElementCollection
	private List<String> skills;
	//工作经验
	@OneToMany(mappedBy = "userinfo", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<UserProcess> up;

	public void setUp(List<UserProcess> up)
	{
		this.up = up;
	}

	public List<UserProcess> getUp()
	{
		return up;
	}

	

	

	public void setSkills(List<String> skills)
	{
		this.skills = skills;
	}

	public List<String> getSkills()
	{
		return skills;
	}

	public void setIntro(String intro)
	{
		this.intro = intro;
	}

	public String getIntro()
	{
		return intro;
	}

//getter and setter
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}

	public String getPost()
	{
		return post;
	}
	public void setPost(String post)
	{
		this.post = post;
	}
	public String getAvatar()
	{
		return avatar;
	}
	public void setAvatar(String avatar)
	{
		this.avatar = avatar;
	}

}
