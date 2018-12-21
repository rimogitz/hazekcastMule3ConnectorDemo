package com.rm.lab.hzc.mule.main;

public class HazelcastStore {

	
	public String get(String key) {
		System.out.println("  Hazelcast GET  Called "+key);
		return HazelcastClientConnection.getInstance().get(key);
	}
	
	public String  put(String key,String value) {
		System.out.println(" Hazelcast PUT Called "+ key + " :: "+ value);
		return HazelcastClientConnection.getInstance().put(key, value);
	}
}
