package RollSplits;

import java.util.Scanner;

public class RollNoSplitsController {
static RollNoSplits split = new RollNoSplits();
static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Number Of Groups");
		int group = scan.nextInt();
 
		System.out.println("Enter The Number OF Students");
		int student = scan.nextInt();
		System.out.println("Enter The Starting Roll Number");
		int roll = scan.nextInt();
		split.splits(group, student, roll);
		System.out.println("----------------------------------");
		System.out.println("Enter The Factorial Of Number ");
		int num = scan.nextInt();
		int factotial = split.factorial(num);
		int sumDigit = split.sumDigit(factotial);
		System.out.println(" Facrorial "+factotial);
		System.out.println("Sum Of Factorial Digits "+sumDigit);
		System.out.println("---------------------------------------------");
		System.out.println("Enter the Natural number Sum ");
		int natural = scan.nextInt();
		int sum = split.sumNatural(natural);
		System.out.println("sum Of Natural Number "+sum);
		split.largeAndSmallDigit(sum);
		
		
		
	}

}
