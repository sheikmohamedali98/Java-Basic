package CheckProgram;

import java.util.Scanner;

public class checkController {

	static Check check = new Check();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("Enter the character :");
//		char ch = scan.next().charAt(0);
//		if(check.alphabetCheck(ch)) {
//			System.out.println("give character is Alphabet ");
//		}else {
//			System.out.println("give character is  not Alphabet ");
//
//		}
//		System.out.println("--------------------------------------");
//
//		if(check.vowelOrConsonant(ch)) {
//			System.out.println("give character is Vowel ");
//		}else {
//			System.out.println("give character is  consonant ");
//		}
//		System.out.println("=========================================");
//		System.out.println("ASCII Value Of Character "+check.findAscii(ch));
//		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
//		System.out.println("Enter the Number ");
//		int num = scan.nextInt();
//		if(check.NumberisEvenorOdd(num)) {
//			System.out.println("give Number is Even ");
//		}else {
//			System.out.println("give Number is  Odd ");
//		}
//		System.out.println("------------------------------------------------");
//		System.out.println("Given Number is "+check.NumberisPositiveorNegative(num));
//		System.out.println("-----------------------------------------");
//		System.out.println("Enter The Number To Divide");
//		int number = scan.nextInt();
//		System.out.println("Enter the divide number");
//		int divide = scan.nextInt();
//		System.out.println("Quotient "+check.quotient(number, divide));
//		System.out.println("Remainder "+check.remainder(number, divide));
		System.out.println("-----------------------------------------------");
		System.out.println("Enter The num1 And Num2 ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		check.swap(num1, num2);
		System.out.println("----------------------------------");
		System.out.println("Enter the num3 ");
		int num3 = scan.nextInt();
		System.out.println("Maximum Number Of Three number "+check.findLargeNumber(num1, num2, num3));
		
	}

}
