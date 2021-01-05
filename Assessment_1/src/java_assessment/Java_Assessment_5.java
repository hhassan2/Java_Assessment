package java_assessment;

import java.util.Scanner;

public class Java_Assessment_5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//		System.out.print("Enter your name: ");
//		String name = input.next();
//		System.out.println("Name: "+ name);
//		System.out.print("Enter first number: ");
		
		
		int num1 = input.nextInt(); 
		System.out.println("Input first number: "+num1);
		
		int num2 = input.nextInt();
		System.out.println("Input second number: "+num2);
		
		int result = num1 * num2;
		
		//25 x 5 = 125
		
		
		System.out.println(num1+" x "+num2+" = "+result);
		

	}

}
