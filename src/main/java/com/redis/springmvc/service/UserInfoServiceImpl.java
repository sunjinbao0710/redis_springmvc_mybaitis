package com.redis.springmvc.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.redis.springmvc.dao.RedisDao;
import com.redis.springmvc.dao.UserInfoDao;
import com.redis.springmvc.model.UserInfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {
	
	@Resource
	UserInfoDao userInfoDao;
	
	@Resource
	RedisDao redisDao;

	@Override
	public List<UserInfo> getUserInfos() {
		return userInfoDao.getUserInfos();
	}

	@Override
	public UserInfo getUserInfoByID(int id) {
		return userInfoDao.getUserInfoByID(id);
	}

	@Override
	public String getValueByRedisKey(String key) {
		return redisDao.get(key);
	}

}
