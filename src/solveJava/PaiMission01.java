package solveJava;

import java.util.Scanner;

public class PaiMission01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int nSum = 0;

		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();

			nSum += s;
		}

		System.out.println(nSum);

		sc.close();
	}
}
