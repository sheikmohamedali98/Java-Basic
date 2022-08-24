package Programs;

public class IncrementAndDecrement {

	public static void main(String[] args) {

	int a = 28;
	a+=a++ + ++a+-a+a;
	System.out.println("19 Sum "+a);
	int  x =5;
	
	
	int x1 = ++x -x++ + -x;
	System.out.println("23 sum "+x1);
	 x = 5;
	x = x++*2+3*-x;
	System.out.println("20 sum "+x);
	
	int y =10;
	int z = (++y*(y++ +5));
	System.out.println("21 sum "+z);
	
	 x =69>>>2;
	 System.out.println("18 4 sum "+x);
	}
	
}
