### Functional Interfaces and Lambda Expressions
------------------------------------------------
1. In the class LambdaExercise, create following static variables
			1. countries of type List<String>
			2. countryCapitals of type Map<String, String>  
			
   In a static block, initialize countries and countryCapitals with soe values
	
	Define following static methods and provide the implementation as given below
	 
	- displayCountries
		- Iterate through the List and display the list using forEach(Consumer) method
		
	- displayCountryCapitals
		- Iterate through the Map and display the map using forEach(BiConsumer) method
	
	- sortCountriesByName
		- Sort the List using Comparator(Lambda Exp). Sort in the reverse alphabetical order
	
	- sortCountriesBylength
		- Sort the List using Comparator, in descending order of number of characters in the country name.
	 	  If the number of characters are same for a country, it should be sorted alphabetically
	 	  (Use Comparator's static/default methods)
	 	  
	- removeCountry(String name)
	    - remove the countries whose name is greater than 6 characters
	
	
Execute the methods and display the results in main method 
