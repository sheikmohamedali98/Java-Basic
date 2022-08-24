package Programs;

import java.util.Scanner;

public class SmallProgramsController {

	static SmallPrograms program = new SmallPrograms();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Character :");
		char ch = scan.next().charAt(0);
		System.out.println(program.printLetters(ch));
		System.out.println("------------------------------------");
		System.out.println("Enter the number to reverse And Different:");
		int num = scan.nextInt();
		System.out.println(program.differntReverseArray(num));
		System.out.println("-----------------------------");
		System.out.println("Enter the Number rerverse");
		int num1 = scan.nextInt();
		System.out.println(program.reverseNumber(num1));
		System.out.println("=--------------------------------------------");
		System.out.println("Enter the Square Size :");
		int square = scan.nextInt();
		System.out.println("Area of Square "+program.areaSquare(square));
		System.out.println("-----------------------------------------------");
		System.out.println("Enter the width of Rectangle :");
		int width = scan.nextInt();
		System.out.println("Enter the height of Rectangle :");
		int height = scan.nextInt();
		System.out.println("Area of Rectangle "+program.areaRectangle(width, height));
		System.out.println("-----------------============================");
		System.out.println("Enter the radius of Cylinder :");
		int radius = scan.nextInt();
		System.out.println("Enter the Height of cylinder");
		int Height = scan.nextInt();
		System.out.println("Area of cylinder "+program.areaCylinder(Height, radius));
		System.out.println("------------------------------------------------");
		System.out.println("Enter the radius Of Two Circle ");
		int radius1 = scan.nextInt();
		int radius2 = scan.nextInt();
		System.out.println(" area of the space between circles "+program.spaceBetweenConcentricCircle(radius1, radius2));

		System.out.println("-------------------------------------------------------------");

	}

}
