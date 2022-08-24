package Tables;

import java.util.Scanner;

public class TableController {
	static Tables tab = new Tables();

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int limit;
		int table;
		outer: while (true) {
			System.out.println("************************************");
			System.out.println("Choose Which Table ");
			System.out.println("1)Addition");
			System.out.println("2)Subraction");
			System.out.println("3)Multiplication");
			System.out.println("4)Exit");
			System.out.println("-------------------------");
			System.out.println("Enter the Choice");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the Limit:");
				limit = scan.nextInt();
				System.out.println("Enter the table ");
				table = scan.nextInt();
				try {
					tab.addition(limit, table);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 2:
				System.out.println("Enter the Limit:");
				limit = scan.nextInt();
				System.out.println("Enter the table ");
				table = scan.nextInt();
				try {
					tab.subraction(limit, table);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3:
				System.out.println("Enter the Limit:");
				limit = scan.nextInt();
				System.out.println("Enter the table ");
				table = scan.nextInt();
				try {
					tab.multiply(limit, table);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 4:
				break outer;
			}

		}
	}

}
