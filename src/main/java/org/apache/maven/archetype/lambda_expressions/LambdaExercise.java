package org.apache.maven.archetype.lambda_expressions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaExercise {
	
	static List<String> countries= new ArrayList<>();
	static Map<String,String> countryCapitals = new HashMap<>();

	
	static {
		countries.add("India");
		countries.add("America");
		countries.add("Australia");
		countries.add("China");
		countries.add("Japan");
		
		countryCapitals.put("India","New Delhi");
		countryCapitals.put("America","Washington");
		countryCapitals.put("Australia","Canberra");
		countryCapitals.put("China","Beijing");
		countryCapitals.put("Japan","Tokyo");
	}
	
	
	public static void displayCountries() {
		System.out.println("**List of Counties**\n");
		countries.forEach(n -> System.out.println(n));	
		System.out.print("\n\n\n");
	}
	
	
	public static void displayCountryCapitals() {
		System.out.println("**Map of Country**\n");
		countryCapitals.forEach((k,v) -> System.out.println(k + "->" +v));
		System.out.print("\n\n\n");
	}
	
	
	public static void sortContriesByName() {
		System.out.println("**Sorting in alphabetical**\n");
		countries.sort((c1,c2) -> c2.compareTo(c1));
		countries.forEach(n -> System.out.println(n));
		System.out.print("\n\n\n");
	}
	
	
	public static void sortCountriesBylength() {	
		System.out.println("**Sorting based on length**\n");
		countries.sort(Comparator.comparing(String::length).reversed().thenComparing((c1,c2) -> c1.compareTo(c2)));
		countries.forEach(n -> System.out.println(n));
		System.out.print("\n\n\n");
	}
	
	
	public static void remove() {
		System.out.println("**Deletion**\n");
		countries.removeIf(n -> n.length()>6);
		countries.forEach(n -> System.out.println(n));
		System.out.print("\n\n\n");
	}
	
	public static void main(String[] args) {
		
		
		LambdaExercise.displayCountries();
		LambdaExercise.displayCountryCapitals();
		LambdaExercise.sortContriesByName();
		LambdaExercise.sortCountriesBylength();
		LambdaExercise.remove();
	}

}
