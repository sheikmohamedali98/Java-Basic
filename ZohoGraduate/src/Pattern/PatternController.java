package Pattern;

import java.util.Scanner;

public class PatternController {

	static PatternProgram pattern = new PatternProgram();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Enter The Capital Charcter Pattern:");
//		char ch = scan.next().charAt(0);
//	     pattern.alphabetPattern(ch);
//		System.out.println("----------------------------------------");
//		System.out.println("Enter the prymid pattern  number");
//		int num = scan.nextInt();
//		pattern.numberPrymid(num);
//		System.out.println("----------------------------------------");
//		System.out.println("Prymid large to small");
//		pattern.numberPrymidLarge(num);
//		System.out.println("----------------------------------------");
//		System.out.println("Start Pattern");
//		pattern.startPrymid(num);
//		System.out.println("-------------------------------------------");
//		System.out.println("Prymind Number");
//		pattern.prymidNumber(num);
//		System.out.println("-------------------------------------------");
//		System.out.println("Enter the number To Print 'C'  ");
//		int num1 = scan.nextInt();
//		pattern.printC_Pattern(num1);
//		System.out.println("------------------------------------------------");
//		System.out.println("Enter the number to print Pattern increase by 1 ");
//		int num2 = scan.nextInt();
//		pattern.increaceBy1(num2);
//		System.out.println("----------------------------------------------");
		pattern.printStarAndLine(4);

	}

}
