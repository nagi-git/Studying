package solveJava;

import java.util.Scanner;

public class PaiC14Integer5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sumA5more = 0;
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();

			sumA5more += is5more(a);
		}
		System.out.println(sumA5more);

		sc.close();
	}

	private static int is5more(int a) {
		if(a >= 5) {
			return a;
		} else {
			return 0;
		}
	}

}
