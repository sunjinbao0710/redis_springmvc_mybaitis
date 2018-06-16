package com.redis.springmvc.dao;

import javax.annotation.Resource;

import com.redis.springmvc.utils.JedisUtil;

import redis.clients.jedis.JedisPool;

public class RedisDaoImpl implements RedisDao {
	
	@Resource
	JedisPool jedisPool;

	@Override
	public String get(String key) {
		JedisUtil jedisUtil = new JedisUtil(jedisPool);
		JedisUtil.Strings strings = jedisUtil.new Strings();
		System.out.println("cache:"+strings);
		strings.set(key, "redis测试字符串");//设置缓存，用于测试查询key
		return strings.get(key);
	}

}
