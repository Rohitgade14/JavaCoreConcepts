package com.java8.interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
	
	public static void main(String[] args) {
		   List<List<String>> skillSets = Arrays.asList(
				   Arrays.asList("java ","java 8","Spring Boot"),
				   Arrays.asList("React","Angular","Vue","BootStrap"),
				   Arrays.asList("MySQL,postgresql","monoDB"));
		   
		    System.out.println(skillSets);
		     
		    // flat map with lambda
		    List<String> allSkills = skillSets.stream()
		          .flatMap(skill-> skill.stream())
		          .collect(Collectors.toList());
		    System.out.println(allSkills);
		    
		    
		    // flat map with method ref
		      List<String> allSkills1 = skillSets.stream()
		    		  .flatMap(List::stream)
		    		  .collect(Collectors.toList());
		      System.out.println(allSkills1);
		       
		      
		      
		            // with map by twice this not ideal
				   // problem with map it will return List<Stream><String>
		          Stream<List<String>> streamResult = skillSets.stream()
		        		     .map(skills-> skills.stream()
		            		.collect(Collectors.toList()));
		            System.err.println(streamResult);
		            
		            
		            
//		              this have Solution but not ideal way but problem not solve
		             List<List<String>> result = skillSets.stream()
		             .map(skill -> skill.stream()
		             .collect(Collectors.toList()))
		             .collect(Collectors.toList());
		             System.out.println(result);
		            
		             
		            
		          
		      
		      
		 
		         
		    
		          
		    
		   
		   
		   
	}
	

}
