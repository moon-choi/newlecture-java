package com.newlecture.app.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
//		IntList list = new IntList();
//		ObjectList list = new ObjectList();
//		GenericList<Integer> list = new GenericList<>();
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(9);

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		int size = list.size();
		System.out.printf("size : %d\n", size);
		
		list.clear();
		size = list.size();
		System.out.printf("size : %d\n", size);
		
		list.add(7);
		size = list.size();
		System.out.printf("size : %d\n", size);
		
		int num = (Integer)list.get(0); //Object 형을 -> Integer형으로 
		// 실제로 나온것은 new Integer(3)이지만 오토언박싱됌. 
		
		System.out.printf("num : %d\n", num);
			
		//Set
		Set<Integer> set = new HashSet<>();
		set.add(3);
		set.add(5);
		set.add(8);
		set.add(9);
		
		for (int val : set) {
			System.out.println(val);
		}
		
		//Map
		Map<Integer, String> map = new HashMap<>();
		map.put(3, "hi");
		map.put(5, "hello");
		map.put(8, "bye");
		map.put(9, "good");
		
		//방법 1
		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "번 값: " + entry.getValue());
		}
		
		//방법 2
		for(int key : map.keySet()) {
			System.out.println(key + "번 값: " + map.get(key));
		}
					
	}

}

/*
범용자료형의 단점: 매번 형변환해줘야 함. -> 이를 극복하기 위해 Generic 씀. 
*/