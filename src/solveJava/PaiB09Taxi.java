package solveJava;

import java.util.Scanner;

public class PaiB09Taxi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// タクシーの種類数
		int n = sc.nextInt();
		// 目的地までの距離
		int x = sc.nextInt();

		// 合計運賃
		int allMoney = 0;
		// 最高運賃
		int highestMoney = 0;
		// 最低運賃
		int lowestMoney = 5000;
		for(int i = 0; i < n; i++) {
			// 初乗り距離
			int a = sc.nextInt();
			// 初乗り運賃
			int b = sc.nextInt();
			// 加算距離
			int c = sc.nextInt();
			// 加算運賃
			int d = sc.nextInt();

			// 合計運賃を計算する
			allMoney = sumMoney(x, a, b, c, d);

			// 最高運賃
			highestMoney = compareMoneyHigh(allMoney, highestMoney);

			// 最低運賃
			lowestMoney = compareMoneyLow(allMoney, lowestMoney);

//			System.out.println(allMoney[i]);
		}
		System.out.println(lowestMoney + " " + highestMoney);
	}

	private static int compareMoneyHigh(int allMoney, int highestMoney) {
		if(allMoney > highestMoney) {
			highestMoney = allMoney;
		}
		return highestMoney;
	}

	private static int compareMoneyLow(int allMoney, int lowestMoney) {
		if(allMoney < lowestMoney) {
			lowestMoney = allMoney;
		}
		return lowestMoney;
	}

	private static int sumMoney(int x, int a, int b, int c, int d) {
		int allMoney = 0;
		if(x < a) {
			allMoney = b;
		} else if(x == a) {
			allMoney = b + d;
		} else {
			allMoney = b + d + ((x - a) / c) * d;
		}
		return allMoney;
	}

}
