package com.example.demo.service;
import com.example.demo.model.*;
import com.example.demo.repository.*;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
@Service
public class UserInfoService {
    
    @Autowired
    private UserInfoRepository userInfoRepository;
	//
    public UserInfo getUserInfoByName(String name) {
		UserInfo ui = userInfoRepository.findByName(name);
		System.out.println("Repository返回的值："+ui);
        return ui;
    }
	public UserInfo getUserInfoById(Long id) {
		Optional<UserInfo> userInfo = userInfoRepository.findById(id);
		//images/me.jpg 张三 Java后端开发工程师 具有 5 年的前端开发经验，熟悉 HTML、CSS、JavaScript 和 React，擅长开发高效、用户友好的 Web 应用。
		//userInfo.setSkills(Arrays.asList("HTML", "CSS"));
		if (userInfo.isPresent()) {
			return userInfo.get();
		}
		return null;
    }
	public void addSkills(UserInfo ui, String skill){
		List<String> sk =ui.getSkills();
		sk.add(skill);
		ui.setSkills(sk);
		userInfoRepository.save(ui);
	}
//	public void addUserInfo(){
//		UserInfo ui = new UserInfo();
//		ui.setAvatar("images/me.jpg");
//		ui.setName("张三");
//		ui.setPost("Java后端开发工程师");
//		ui.setIntro("具有 5 年的前端开发经验，熟悉 HTML、CSS、JavaScript 和 React，擅长开发高效、用户友好的 Web 应用。");
//		ui.setSkills(Arrays.asList("HTML", "CSS"));
//		userInfoRepository.save(ui);
//	}
}
