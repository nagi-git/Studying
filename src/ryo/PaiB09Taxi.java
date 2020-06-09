package ryo;

import java.util.Scanner;

public class PaiB09Taxi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// タクシーの種類数
		int n = sc.nextInt();
		// 目的地までの距離
		int x = sc.nextInt();

		int maxAmount = 0;
		int minAmount = 0;

		// タクシーの数分繰り返す
		for (int i = 0; i < n; i++) {
			// 初乗り距離
			int a = sc.nextInt();
			// 初乗り運賃
			int b = sc.nextInt();
			// 加算距離
			int c = sc.nextInt();
			// 加算運賃
			int d = sc.nextInt();

			// 合計運賃を計算する
			int totalAmount = sumMoney(x, a, b, c, d);

			if (totalAmount > maxAmount) {
				maxAmount = totalAmount;
			}
			if (minAmount == 0 || totalAmount < minAmount) {
				minAmount = totalAmount;
			}
		}

		System.out.println(minAmount + " " + maxAmount);
	}

	private static int sumMoney(int x, int a, int b, int c, int d) {
		if (x < a) {
			return b;
		}

		int allMoney = b;
		int additionalAmount = ((x - a) / c + 1) * d;
		return allMoney + additionalAmount;
	}

}
