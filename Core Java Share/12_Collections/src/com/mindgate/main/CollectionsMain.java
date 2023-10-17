package com.mindgate.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionsMain {
	public static void main(String[] args) {
		System.out.println("1. ArrayList");
		List<String> nameList = new ArrayList<String>();
		nameList.add("Moorthi");
		nameList.add("Moorthi");
		nameList.add("Kripa");
		nameList.add("Sudharshan");
		nameList.add("Kripa");
		System.out.println(nameList);
		System.out.println(nameList.size());
		nameList.add("Thiru");
		nameList.add("Akshaya");
		System.out.println(nameList);
		System.out.println(nameList.size());
		nameList.remove("Thiru");
		System.out.println(nameList);
		System.out.println(nameList.size());

		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("2. HashSet");
		Set<String> nameSet = new HashSet<String>();
		nameSet.add("Dhanalaxmi");
		nameSet.add("Ashok");
		nameSet.add("Bharthi");
		nameSet.add("Mageshwar");
		nameSet.add("Bharthi");
		nameSet.add("Ashok");
		System.out.println(nameSet);
		System.out.println(nameSet.size());
		nameSet.remove("Ashok");
		System.out.println(nameSet);
		System.out.println(nameSet.size());
		System.out.println("Ashok".hashCode());
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("3. HashMap");
		Map<Integer, String> userMap = new HashMap<Integer, String>();
		userMap.put(101, "Srinivasan");
		userMap.put(1, "Aswin");
		userMap.put(103, "Rajesh");
		userMap.put(104, "Sibi");
		System.out.println(userMap);
		Set<Integer> userKeys = userMap.keySet();
		System.out.println(userKeys);
		Collection<String> userValues = userMap.values();
		System.out.println(userValues);

		for (Integer i : userKeys) {
			System.out.println(userMap.get(i));
		}
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("4. TreeSet");
		Set<String> nameSortedSet = new TreeSet<String>();
		nameSortedSet.add("Dhanalaxmi");
		nameSortedSet.add("Ashok");
		nameSortedSet.add("Bharthi");
		nameSortedSet.add("Mageshwar");
		nameSortedSet.add("Bharthi");
		nameSortedSet.add("Ashok");
		System.out.println(nameSortedSet);
		System.out.println("+++++++++++++++++++++++++++++++++");
		System.out.println("5. TreeMap");
		Map<Integer, String> productTreeMap = new TreeMap<Integer, String>();
		productTreeMap.put(105, "Lux");
		productTreeMap.put(101, "Nirma");
		productTreeMap.put(103, "Hamam");
		productTreeMap.put(104, "Papaya");
		productTreeMap.put(102, "Dove");
		productTreeMap.put(100, "Santoor");
		System.out.println(productTreeMap);

	}

}
