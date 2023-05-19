package github.java;

import java.util.Scanner;

public class Nangarhar {

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		System.out.println("Enter your country best products: ");
		String[] products = new String[5];
		String prod = " ";
		for (int i = 0; i < products.length; i++) {
			prod += console.next();
		}
		System.out.print("Your products: " + prod);
	}
}
