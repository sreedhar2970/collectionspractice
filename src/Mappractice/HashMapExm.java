package Mappractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExm {
	
	public static void main(String[] args) {
		
		Map<String,String> mapObject1 = new HashMap<String,String>();
		mapObject1.put("name1", "Kamran");
		mapObject1.put("name2", "Manoj");
		mapObject1.put("name3", "Amit");
		mapObject1.put("name4","Pavan");
		mapObject1.put("name5","Sangmesh");
		mapObject1.put("name6","Subrat");
		mapObject1.put("name7","Roshni");
		mapObject1.put("name7", "arun");
		
		//traversing through map object
		System.out.println("===========using entryset()==============");
		for(Map.Entry<String,String> name : mapObject1.entrySet()) {
			System.out.println("key : " + name.getKey() + " === Value : " + name.getValue() );
		}
		
		HashMap<Integer,String> mapObject2 = new HashMap<Integer,String>();
		mapObject2.put(101,"mango");
		mapObject2.put(102,"apple");
		mapObject2.put(103,"banana");
		mapObject2.put(104,"grape");
		mapObject2.put(105,"orange");
		//traversing the fruits
		for(Map.Entry<Integer,String> fruit : mapObject2.entrySet()) {
			System.out.println("key:"+fruit.getKey() +"=== Value :"+fruit.getValue());
		}
		mapObject1.putIfAbsent("name10", "Arnab Saha");
		System.out.println("================= using entrySet() =========================");
		for(Map.Entry<String, String> fruit : mapObject1.entrySet()) {
			System.out.println("key : " + fruit.getKey() + " === Value : " + fruit.getValue() );
		}
		
		}
	}

