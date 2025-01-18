package com.example.demo.model;

import jakarta.persistence.*;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"userinfo"})  // 忽略序列化中的userinfo
@Entity
public class UserProcess
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//公司 
	private String groupname;
	//职位
	private String position;
	//工作时间
	private String worktime;
	//userinfo对应的实例
	@ManyToOne
    @JoinColumn(name = "userinfo_id", nullable = false)
	private UserInfo userinfo;

	public void setUserinfo(UserInfo userinfo)
	{
		this.userinfo = userinfo;
	}

	public UserInfo getUserinfo()
	{
		return userinfo;
	}

	public void setGroupname(String groupname)
	{
		this.groupname = groupname;
	}

	public String getGroupname()
	{
		return groupname;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public String getPosition()
	{
		return position;
	}

	public void setWorktime(String workTime)
	{
		this.worktime = workTime;
	}

	public String getWorktime()
	{
		return worktime;
	}
	
	public Long getId()
	{
		return id;
	}
	public void setId(Long id)
	{
		this.id = id;
	}

	

}
