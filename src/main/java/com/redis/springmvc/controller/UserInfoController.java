package com.redis.springmvc.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.redis.springmvc.model.UserInfo;
import com.redis.springmvc.service.UserInfoService;

@Controller
public class UserInfoController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Resource
	UserInfoService userInfoService;
	
	@RequestMapping("/userInfo")
	public ModelAndView getUserInfoByID(int id){
		//指定view层的页面,参数user即为对应的jsp的名称
		ModelAndView mav = new ModelAndView("user");
		if (id<=0) {
			id=1;
		}
		//获取数据
		UserInfo userInfo = userInfoService.getUserInfoByID(id);
		//
		mav.addObject("user", userInfo);
		return mav;
	}
	
	@RequestMapping("/getUserInfos")
	@ResponseBody
	public List<UserInfo> getUserInfos(){
		List<UserInfo> users = userInfoService.getUserInfos();
		logger.info(""+JSON.toJSONString(users));
		return users;
	}
	
}
