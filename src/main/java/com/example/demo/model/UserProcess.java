package com.example.demo.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class UserProcess
{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	//公司
	private String group;
	//职位
	private String position;
	//工作时间
	private String workHours;

	public void setGroup(String group)
	{
		this.group = group;
	}

	public String getGroup()
	{
		return group;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public String getPosition()
	{
		return position;
	}

	public void setWorkHours(String workHours)
	{
		this.workHours = workHours;
	}

	public String getWorkHours()
	{
		return workHours;
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
