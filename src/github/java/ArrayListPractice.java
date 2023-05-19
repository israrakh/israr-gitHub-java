package github.java;

import java.util.ArrayList;

public class ArrayListPractice {
	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList<>();
		cities.add("Afghanistan");
		cities.add("Japan");
		cities.add("Germany");
		cities.add("Turkey");
		cities.add("India");
		
		for (String city : cities) {
			System.out.println(city);
		}
	}
}
