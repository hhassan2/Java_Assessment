package java_assessment;

import java.util.Scanner;

public class Java_Assessment_6 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
//			Test Data:
//			Input first number: 125
//			Input second number: 24
//			Expected Output :
//			125 + 24 = 149
//			125 - 24 = 101
//			125 x 24 = 3000
//			125 / 24 = 5
//			125 mod 24 = 5
		
		int num1 = input.nextInt(); 
		System.out.println("Input first number: "+num1);
		
		int num2 = input.nextInt();
		System.out.println("Input second number: "+num2);
		
		 
		  System.out.println(num1 + " + " + num2 + " = " + 
		  (num1 + num2));
		   
		  System.out.println(num1 + " - " + num2 + " = " + 
		  (num1 - num2));
		   
		  System.out.println(num1 + " x " + num2 + " = " + 
		  (num1 * num2));
		   
		  System.out.println(num1 + " / " + num2 + " = " + 
		  (num1 / num2));
		 
		  System.out.println(num1 + " mod " + num2 + " = " + 
		  (num1 % num2));

	}

}
