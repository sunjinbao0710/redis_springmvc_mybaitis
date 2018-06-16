package com.redis.springmvc.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.redis.springmvc.model.UserInfo;
import com.redis.springmvc.service.UserInfoService;

public class UserInfoTest extends SpringTestCase {

	@Resource
	UserInfoService userInfoService;
	
	@Test
	public void selectUserByIdTest() {
		UserInfo userInfo = userInfoService.getUserInfoByID(1);
		logger.debug("查询结果" + userInfo.toString());
	}
	
	@Test
	public void selectUserInfosTest() {
		List<UserInfo> users = userInfoService.getUserInfos();
		logger.debug("查询结果" + JSON.toJSONString(users));
	}
	
	@Test
    public void getValueByRedisKey(){
        String va  =userInfoService.getValueByRedisKey("name");
        logger.debug("key为name的redis数据:"+va);
    }
	
}
