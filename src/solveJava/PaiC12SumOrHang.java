package solveJava;

import java.util.Scanner;

public class PaiC12SumOrHang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int calcNum = 0;
		int totalNum = 0;

		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			// aとbを足し算か掛け算する
			calcNum = calcNum(a, b);

			// calcNumをすべて足す
			totalNum += calcNum;
		}

		// 出力
		System.out.println(totalNum);
	}

	private static int calcNum(int a, int b) {
		if(a != b) {
			return a + b;
		} else {
			return a * b;
		}
	}

}
