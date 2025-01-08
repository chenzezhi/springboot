package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.*;
import com.example.demo.model.*;
import java.util.Optional;
@Service
public class UserInfoService {
    
    @Autowired
    private UserInfoRepository userInfoRepository;
	//
    public String getUserInfoByName(String name) {
		UserInfo ui = userInfoRepository.findByName(name);
		System.out.println("Repository返回的值："+ui);
        return ui==null?"无用户数据":ui+"";
    }
	public UserInfo getUserInfoById(Long id) {
		Optional<UserInfo> userInfo = userInfoRepository.findById(id);
		if (userInfo.isPresent()) {
			return userInfo.get();
		}
		return null;
    }
}
