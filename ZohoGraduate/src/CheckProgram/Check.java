package CheckProgram;

public class Check {

	public boolean alphabetCheck(char ch) {
		if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z') {
			return true;
		}
		return false;
	}
	
	public boolean vowelOrConsonant(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			return true;
		}
		return false;
	}
	
	public int findAscii(char ch) {
		int value = ch;
		return value;
	}
	
	public boolean NumberisEvenorOdd(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	
	public String NumberisPositiveorNegative(int num) {
		if(num>0) {
			return "Postive";
		}else if(num<0) {
			return "negative";
		}else {
			return "Zero";
		}
	}
	
	public int quotient (int num,int divide) {
		return num/divide; 
	}
	
	public int remainder(int num,int divide) {
		return num%divide;
	}
	public void swap(int num1,int num2) {
		System.out.println("before Swap ");
		System.out.println("num1 "+num1+" num2 "+num2);
		int  ans =(num1^num2)^num1;
		 num2 = (num2^num1)^num2;
		 System.out.println("After Swap ");
			System.out.println("num1 "+ans+" num2 "+num2);
		
	}
	public int findLargeNumber(int num1,int num2,int num3) {
		int max1= Math.max(num1, num2);
		int max2 = Math.max(max1, num3);
		return max2;
	}
}
