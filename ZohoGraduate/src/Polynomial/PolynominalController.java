package Polynomial;

import java.util.Scanner;

public class PolynominalController {

	static Polynominal polynomial = new Polynominal();
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the A,B,C values ");
		double a = scan.nextDouble();
		double b =  scan.nextDouble();
		double c = scan.nextDouble();
		polynomial.quadratic(a, b, c);

	}

}
