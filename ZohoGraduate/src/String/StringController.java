package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringController {
;	static StringProgram string = new StringProgram();
static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "test123String";
		String str2 = "123";
		System.out.println(string.subString(str1, str2));
		System.out.println("==============================");
		String str3 = "12345";
		string.stringPattern(str3);
		System.out.println("===================================");
		string.stringPatternAlter(str3);
		System.out.println("======================================");
		System.out.println("Enter The String like  a1b10 :");
		String str4 = scan.next();
		string.printAlphabet(str4);
		System.out.println();
		System.out.println("======================================");
		String str5 ="one two three";
		System.out.println("input :"+str5);
		System.out.println(Arrays.toString(string.reverse(str5)));
		System.out.println("======================================");
		System.out.println("Enter the sum of Series :");
		int num = scan.nextInt();
		System.out.println(string.sumOfSeries(num));
		System.out.println("==============================================");
		
	}

}
