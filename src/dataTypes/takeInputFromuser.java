package dataTypes;

import java.util.Scanner;

public class takeInputFromuser {

	public static void main(String[] args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		
		// Taking user details as input 
		System.out.println("Enter your name : ");
		String name=sc.nextLine();
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("Enter your height (In feet) : ");
		float height=sc.nextFloat();
		System.out.println("Enter your grade: ");
		char grade=sc.next().charAt(0);
		System.out.println("Are you passed? : true | false");
		boolean isPassed=sc.nextBoolean();
		
		
		//Print user details in output
		System.out.println("============= User Details ===========");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Height ( In Feet): "+height);
		System.out.println("Grade: "+grade);
		System.out.println("Passed: "+isPassed);
		
		
	}

}
