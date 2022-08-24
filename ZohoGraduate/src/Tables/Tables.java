package Tables;

public class Tables {

	public  void addition(int limit, int table) {
		for(int i=1;i<=limit;i++) {
			int c = i+table;
			System.out.println(i+"+"+table+"="+c);
		}

	}

	public void subraction(int limit, int table) {
		for(int i=1;i<=limit;i++) {
			int c = i-table;
			System.out.println(i+"-"+table+"="+c);
		}

	}

	public void multiply(int limit, int table) {

		for(int i=1;i<=limit;i++) {
			int c = i*table;
			System.out.println(i+"*"+table+"="+c);
		}
	}

}
