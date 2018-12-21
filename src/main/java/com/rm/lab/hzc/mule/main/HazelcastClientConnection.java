package com.rm.lab.hzc.mule.main;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

public class HazelcastClientConnection {
	
	public static final HazelcastClientConnection hCC=new HazelcastClientConnection();
	private IMap<String, String> map;
	 
	
	public static HazelcastClientConnection getInstance(){
		return hCC;
	}
	private  HazelcastInstance hzClient;
	public HazelcastClientConnection(){
		ClientConfig clientConfig = new ClientConfig();
        clientConfig.addAddress("127.0.0.1");
        hzClient = HazelcastClient.newHazelcastClient(clientConfig);
        map = hzClient.getMap("muleMap");
	}
	
	public HazelcastInstance getHazelcast(){
		return hzClient;
	}
	
	public String put(String key,String value){
		return map.put(key,value);
	}
	
	public String get(String key){
		return map.get(key);
	}

}
