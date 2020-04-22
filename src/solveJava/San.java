package solveJava;

public class San {

	public static void main(String[] args) {

		int aTeki = 0;
		int Sum = 0;
		for(int i = 3; i < 333; i++) {
			if(i / 3 == 0) {
				aTeki = i;
				Sum += aTeki;
				System.out.println(aTeki);
			} else if(Integer.toString(i).contains("3")) {
				aTeki = i;
				Sum += aTeki;
				System.out.println(aTeki);
			}
		}
		System.out.println(Sum);
	}

}
