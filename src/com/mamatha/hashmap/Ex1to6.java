package com.mamatha.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ex1to6 {

	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap();
		hm.put(1, "naag");
		hm.put(2, "riya");
		hm.put(3, "mammu");
		System.out.println(hm);
		for(Map.Entry x :hm.entrySet())
		{
			System.out.println(x.getKey()+" "+x.getValue());
		}
		//Ex 2
		System.out.println("key size in map "+hm.size());
		//Ex3
		HashMap<Integer,String> copyhm = new HashMap<Integer, String>();
	//copyhm=	(HashMap<Integer, String>) hm.clone();
	copyhm.putAll(hm);
		System.out.println(copyhm);
		//Ex 4
		copyhm.clear();
		System.out.println("After clearing dataentries from map"+copyhm);
		//Ex 5
		HashMap<Integer,String> hmData = new HashMap();
		hmData.put(1, "lbnagar");
		hmData.put(2, "uppal");
		hmData.put(3, "madhapur");
		System.out.println(hmData);
		System.out.println("is Empty : "+hmData.isEmpty());
		hmData.clear();
		System.out.println("isEmpty "+hmData.isEmpty());
		//Ex 6
		//shallow copy of data
		
		HashMap<Integer,String> copyhmD = new HashMap<Integer, String>();
		copyhmD=	(HashMap<Integer, String>) hm.clone();
		System.out.println(copyhmD);
		

	}

}
