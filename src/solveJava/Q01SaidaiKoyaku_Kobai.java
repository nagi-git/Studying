package solveJava;

import java.util.Scanner;

public class Q01SaidaiKoyaku_Kobai {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("２つの自然数を入力してください");

		// 数値入力
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 最大公約数を求める
		int gcd = gcdCalc(a, b);

		sc.close();

	}

	private static int gcdCalc(int a, int b) {
		int gcd = 0;
		int lowNum = a;
		// aとbどちらが低いか求める
		if(lowNum > b) {
			lowNum = b;
		}
		// 公約数
		for(int i = 1; i <= lowNum; i++) {
			if(a % i == 0 && b % i == 0) {
				gcd = i;
			}
		}
		return gcd;
	}
}
