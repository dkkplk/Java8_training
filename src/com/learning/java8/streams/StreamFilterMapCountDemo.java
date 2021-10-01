package com.learning.java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterMapCountDemo {

	public static <V> void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names = new ArrayList<String>();

		names.add("RamPrasad");
		names.add("Govind");
		names.add("Dhanesh");
		names.add("Ruchika");
		names.add("Deepika");
		names.add("Mata");
		names.add("Pita");
		names.add("Ba");

		List<String> out = names.stream().filter(s -> s.length() > 6).map(s -> s.toUpperCase())
				.sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());

		long count = names.stream().filter(s -> s.startsWith("D")).count();

		System.out.println(out);
		System.out.println(count);

		Map<String, Integer> map = new HashMap<>();
		map.put("Dhanesh", 99);
		map.put("Govind", 80);
		map.put("Ruchika", 92);
		map.put("Deepika", 60);
		map.put("Mata", 50);
		map.put("Pita", 30);
		map.put("Ba", 40);
		
		//get the name of highest score
		String highest = map.entrySet().stream()
				.max(Map.Entry.comparingByValue())
				.get().getKey();
		String lowest = map.entrySet().stream()
				.min(Map.Entry.comparingByValue())
				.get().getKey();
		
		System.out.println(highest);
		System.out.println(lowest);
		
		map.entrySet().stream()
		.forEach(System.out::println);
		
		map.entrySet().stream()
		.forEach(s -> System.out.println(s));
		
		System.out.println();
		System.err.println();
		
		
		Double[] d = {10.1,20.3,12.4,50.3,60.3,5.2}; 
		Stream<Double> stream = Stream.of(d);
		
		stream.forEach(System.out::println);
		 
		
		
		
		
	}

	private static Stream<Double> StreamOf(Double[] d) {
		// TODO Auto-generated method stub
		return null;
	}

}
