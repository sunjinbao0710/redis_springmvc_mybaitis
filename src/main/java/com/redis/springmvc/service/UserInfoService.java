package com.redis.springmvc.service;

import java.util.List;

import com.redis.springmvc.model.UserInfo;

/**
 * 操作用户信息的service
 * @author Rose
 *
 */
public interface UserInfoService {
	
	/**
     * 获取所有的用户
     * 
     * @return
     */
    public List<UserInfo> getUserInfos();

    /**
     * 根據用戶id获取用户消息
     * 
     * @param id
     * @return
     */
    public UserInfo getUserInfoByID(int id);
    
    /**
     * 根据redis的key获取redis的一个文本型value
     * @param key
     * @return
     */
    public String getValueByRedisKey(String key);
    
}
