package com.fashion.impl.db;

import org.apache.log4j.Logger;

import org.testng.Assert;

import org.testng.annotations.Test;


public class RedisTest {
	private static Logger LOG = Logger.getLogger(RedisTest.class);

	@Test
	public void runTest(){
		DBConnector redis = RedisDB.getDBConnector();
		
		String key = "hola";
		String value = "todos";
		redis.set(key, value);
		String todos = redis.get(key);
		Assert.assertEquals(value, todos);
	}
	
}
