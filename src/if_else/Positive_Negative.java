package if_else;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
		System.out.println("Enter the number : ");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println(num+" is positive");
		}else
			if(num<0) {
				System.out.println(num+" is negative");
			}else {
				System.out.println(num+" is zero");
			}

	}catch(Exception e) {
		System.out.println("Please enter int value. Thanks");
	}
	}
}
