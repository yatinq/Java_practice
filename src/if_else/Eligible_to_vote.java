package if_else;

import java.util.Scanner;

public class Eligible_to_vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name = "";
		int age = 0;
		
		try {
		System.out.print("Enter name of person: ");
		name=sc.nextLine();
		System.out.println();
		System.out.print("Enter age of "+name+" :");
		age=sc.nextInt();
		System.out.println();
		}
		catch(Exception e) {
			System.out.println("Please enter valid input.");
		}
		if(age>=18) {
			System.out.println(name+" is eligible to vote");
		}
		else {
			System.out.println(name+" can not vote");
		}
		sc.close();

	}

}
