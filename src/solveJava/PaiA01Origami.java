package solveJava;

import java.util.Scanner;

public class PaiA01Origami {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String foldPattern = null;

		for(int i = 0; i < n; i++) {
			foldPattern += "0";
		}
		sc.close();
	}

}
