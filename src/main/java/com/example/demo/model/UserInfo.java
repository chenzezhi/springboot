package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class UserInfo
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String post;
	private String avatar;
	private String intro;

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
