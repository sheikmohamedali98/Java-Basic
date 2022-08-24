package String;

public class StringProgram {

	public int subString(String str1, String str2) {
		int len1 = str1.length();
		int len2 = str2.length();

		for (int i = 0; i <= len1 - len2; i++) {
			int j = 0;
			for (j = 0; j < len2; j++) {
				if (str1.charAt(i + j) != str2.charAt(j)) {
					break;
				}
			}
			if (j == len2) {
				return i;
			}
		}
		return -1;
	}

	public void stringPattern(String str) {
		int len = str.length();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == j || i + j == len - 1) {
					System.out.print(str.charAt(i));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public void stringPatternAlter(String str) {
		int len = str.length();

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == j) {
					System.out.print(str.charAt(i));
				} else if (i + j == len - 1) {
					System.out.print(str.charAt(len - i - 1));
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	private void print(char ch ,int val){
		while(val>1) {
			System.out.print(ch);
			val--;
		}
		
		
	}

	public void printAlphabet(String str) {
		char[] chArray = str.toCharArray();

		for (int i = 0; i < chArray.length; i++) {
			int val = 0;
			if (chArray[i] >= '0' && chArray[i] <= '9') {
				try {
					if (chArray[i + 1] >= '0' && chArray[i + 1] <= '9') {
						String a1 = String.valueOf(chArray[i] - 48);
						String a2 = String.valueOf(chArray[i + 1] - 48);
						val = Integer.parseInt(a1 + a2);
						print(chArray[i-1],val);
						i++;
					} else {
						val = chArray[i] - 48;
						print(chArray[i-1],val);
					}

				} catch (ArrayIndexOutOfBoundsException ex) {
					val = chArray[i] - 48;
					print(chArray[i-1],val);

				}
			}else {
				System.out.print(chArray[i]);
			}
		}
	}
	
	
	 public String[]  reverse(String str) {
		 String[] reverse = str.split(" ");
		 if(str== null||str.length()==1) {
			 return reverse;
		 }
		 reverseRecursion(reverse,0,reverse.length-1);
		 
		 return reverse; 
	 }
	
	private  void reverseRecursion(String[] str ,int start,int end) {
		if(start<end) {
			String temp = str[start];
			str[start]  = str[end];
			str[end] = temp;
			reverseRecursion(str,start+1,end-1);
		}
		
	}
	
	public int sumOfSeries(int num) {
		String str = "";
		int sum = 0;
		for(int i=0;i<num;i++) {
			for(int j=0;j<num-i;j++) {
				str+=1;
			}
			int number = Integer.parseInt(str);
			sum+=number;
			str="";
		}
		return sum;
	}
}
