package com.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap1 {
	
	public static void main(String[] args) {
		List<List<String>> skillSets = Arrays.asList(
				Arrays.asList("java","Spring Boot","Jpa"),
				Arrays.asList("Angular","React","Vue"),
				Arrays.asList("postgre","mysql")
				);
		
		     
		    skillSets.stream().flatMap(List::stream)
		    .collect(Collectors.toList()).forEach(System.err::println);
		
		
		   List<String> skills = skillSets.stream().flatMap(List::stream).toList();
		     System.out.println(skills);
		
		  
		
		
	}

}
