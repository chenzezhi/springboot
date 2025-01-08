package com.example.demo.repository;

import com.example.demo.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long>
{
	UserInfo findByName(String name);
}
