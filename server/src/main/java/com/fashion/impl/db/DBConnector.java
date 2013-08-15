package com.fashion.impl.db;

import java.util.Set;

public interface DBConnector {

public Object set(String key, String value);
	
	public String get(String key);
	
	public Object executeQuery(String query);
	
	public long delete(String key);
	
	public Object update(String key, String value);
	
	public Boolean exist(String key);
	
	public long index(String key, long score, String val);
	
	public Set<String> search(String key, String member);
	
	public void remove(String key, String member);

}
