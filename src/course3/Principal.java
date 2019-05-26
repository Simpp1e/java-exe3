package course3;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your full name: "); 
		String name = sc.nextLine();
		
		System.out.print("How many bedrooms are there in your house? ");
		int bedrooms = sc.nextInt();
		
		System.out.print("Enter your product price: "); 
		double price = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line): ");
		String name2 = sc.next();
		int age = sc.nextInt();
		double height = sc.nextDouble();
		
		System.out.printf("Full Name: %s %n", name);
		System.out.printf("Bedrooms: %d %n", bedrooms);
		System.out.printf("Price : %.2f%n ", price);
		System.out.printf("Last Name: %s %n", name2);
		System.out.printf("Age: %d %n", age);
		System.out.printf("Height: %.2f %n", height);

	}

}
