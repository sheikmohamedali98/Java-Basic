package Polynomial;

public class Polynominal {

	public void equationSplit(String str) {
		char[] ch = str.toCharArray();
		
		for(int i =0;i<ch.length;i++) {
			
		}
	}
	public void quadratic(double a,double b,double c) {
		double positiveroot,negativeroot;
		double det = b*b - 4*a*c;
		if(det>0) {
			positiveroot = (-b+Math.sqrt(det))/(2*a);
			negativeroot = (-b-Math.sqrt(det))/(2*a);
			
			System.out.println("positiveroot "+positiveroot+" negativeroot "+negativeroot);
		}else if(det ==0) {
			positiveroot = negativeroot = -b/(2*a);
			System.out.println("positiveroot And  negativeroot "+negativeroot);

		}else {
			double real = -b/(2*a);
			double imaginary = Math.sqrt(-det) /(2*a);
			System.out.println("positiveroot "+real+"+"+imaginary+"i");
			System.out.println("negativeroot "+real+"-"+imaginary+"i");
		}
		
	}
}
