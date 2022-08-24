package Programs;

public class SmallPrograms {

	public String printLetters(char ch) {
		String str = "";
		int num = ch;
		for (int i = num; i <= 90; i++) {
			str += ch++;
		}
		return str;
	}

	public int differntReverseArray(int num) {
		int temp = num;
		int sum = 0;
		int ans;
		while (num != 0) {
			int reminder = num % 10;
			sum = (10 * sum) + reminder;
			num = num / 10;

		}
		ans = temp - sum;
		return ans;
	}
	
	public int reverseNumber(int num) {
		//int temp = num;
		int sum = 0;
		while(num!=0) {
			int reminder = num%10;
			sum = (sum*10)+reminder ;
			num = num/10;
		}
		return sum;
	}

	public int areaSquare(int square) {
		return square*square;
	}
	
	public int areaRectangle(int width,int height ) {
		return width*height;
	}
	
	public double areaCylinder(int height,int radius) {
		final double  pi = 3.14;
		return 2*pi*radius*(height+radius);
	}

	public double spaceBetweenConcentricCircle(int radius1,int radius2) {
		final  double pi = 3.14;
		double area1 = pi*Math.pow(radius1, 2);
		double area2 = pi*Math.pow(radius2, 2);
		return area1- area2;
	}
}
