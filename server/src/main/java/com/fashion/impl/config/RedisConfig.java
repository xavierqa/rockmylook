package com.fashion.impl.config;

public class RedisConfig {
private String hostname; 
	
	private String port;
	
	public RedisConfig() {
		// TODO Auto-generated constructor stub
		this.hostname = "localhost";
		this.port = "6379";
	}
	
	
	public String getHostname() {
		// TODO Auto-generated method stub
		return this.hostname;
	}

	public String getPort() {
		// TODO Auto-generated method stub
		return this.port;
	}
}
