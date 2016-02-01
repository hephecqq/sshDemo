package com.imooc.model;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestUnmodifyMap {

	public static void main(String[] args) {
		Map maps=new HashMap<String,String>();
		maps.put("", "1");
		maps.put("2", "2");
		//java.util.Collections.unmodifiableMap(maps).put("3", "3");
		Iterator<Map.Entry<String, String>> it=maps.entrySet().iterator();
		while(it.hasNext()){
			System.out.println(it.next().getKey());
			System.out.println(it.next().getValue());
		}
		
	}
}
