package com.redis.springmvc.dao;

import java.util.List;

import com.redis.springmvc.model.UserInfo;

/**
 * 操作用户消息的dao
 * @author Rose
 *
 */
public interface UserInfoDao {

	/**
	 * 获取所有的用户
	 * @return
	 */
	public List<UserInfo> getUserInfos();
	
	/**
	 * 根据用戶id获取用户信息
	 * @param id
	 * @return
	 */
	public UserInfo getUserInfoByID(int id);
	
}
