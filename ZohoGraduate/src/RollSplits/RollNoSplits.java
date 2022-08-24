package RollSplits;

import java.util.Arrays;

public class RollNoSplits {
	
	public void  splits(int group,int numberOfStudent, int startingRoll) {
		int num = startingRoll+numberOfStudent;
		
		if(numberOfStudent%group ==0) {
			
			for(int grp = 1;grp<=group;grp++) {
				System.out.println("Group "+ grp);
				startingRoll++;
				for(int sp = startingRoll;sp<=num;sp+=4) {
					System.out.println(sp);
				}
			}
			
		}else {
			System.out.println("You Can't Split Students In Equal Groups");
		}
	}
	
	public int factorial(int n) {
		if(n==0) {
			return 1;
		}
		int f=1;
		f= n*factorial(n-1);
		return f;
	}
	
	public  int  sumDigit(int n) {
		int sum =0;
		while(n!=0) {
			int r = n%10;
			sum += r;
			n = n/10;
		}
		return sum;
	}

	public int sumNatural(int num) {
		int ans = (num*(num+1))/2;
		return ans;
	}
	
	public void largeAndSmallDigit(int num) {
		int index = 0;
		int[] arr = new int[6];
		while(num!=0) {
			int r = num%10;
			arr[index++] = r;
			num = num/10;
		}
		Arrays.sort(arr);
		System.out.println("Large Element in digit "+arr[arr.length-1]);
		System.out.println("Smallest Element In Dugit "+arr[0]);
	}
}
