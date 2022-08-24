package Pattern;

public class PatternProgram {
	public void alphabetPattern(char ch) {

		int num = ch - 64;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print(ch);
			}
			ch--;
			System.out.println();
		}
	}

	public void numberPrymid(int num) {
		for (int row = 1; row <= num; row++) {
			int print = 2 * row - 1;
			int mid = (print / 2) + 1;
			for (int space = 1; space <= num - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= print; col++) {
				if (col <= mid) {
					System.out.print(col);
				} else {

					System.out.print(--mid);
				}
			}
			System.out.println();
		}
	}

	public void numberPrymidLarge(int num) {

		int temp = num;

		for (int row = 1; row <= num; row++) {
			int print = 2 * row - 1;
			int mid = (print / 2) + 1;
			int ans = temp - 1;
			for (int space = 1; space <= num - row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= print; col++) {
				if (col <= mid) {
					System.out.print(++ans);
				} else {
					System.out.print(--ans);
				}
			}
			System.out.println();
			temp--;
		}

	}

	public void startPrymid(int num) {
		for (int row = 1; row <= num; row++) {
			for (int space = 1; space < row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= (num - row) + 1; col++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}

	public void prymidNumber(int num) {
		int temp = num;
		for (int row = 1; row <= num; row++) {
			for (int space = 1; space < row; space++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= (num - row) + 1; col++) {
				System.out.print(temp + " ");
			}
			System.out.println();
			temp--;
		}
	}

	public void increaceBy1(int num) {
		int mid = num / 2;
		int i = 0;

		for (int row = 0; row < mid; row++) {
			for (int space = 0; space < mid - row; space++) {
				System.out.print(" ");
			}

			for (int col = 0; col < row; col++) {
				if (i <num) {
					System.out.print(++i);
				}
			}
			System.out.println();
		}

	}

	public void printC_Pattern(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == 0 || i == num - 1 || j == 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	public void printStarAndLine(int num) {
		int N = 2*num-1;
		for(int i=0;i<N;i++) {
			for(int j=0;j<N+1;j++) {
				if(i==0||j==0||i==N-1||j==N) {
				System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
