package solveJava;

public class Yakusuu {

	public static void main(String[] args) {
		int askNum = 1234567890;
		int askNumSum = 0;
		for(int i = 1; i <= 30000000; i++) {
			if(askNum % i == 0) {
				askNumSum += i;
				System.out.println(i);
				System.out.println(askNumSum);
			}
		}

	}

}
