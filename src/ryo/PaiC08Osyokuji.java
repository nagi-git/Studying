package ryo;

import java.util.Scanner;

public class PaiC08Osyokuji {

	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// 料理の品数
		int m = sc.nextInt();
		// 就活性の人数
		int n = sc.nextInt();

		// 総カロリーを取得
		int[] nKcal = getNKcal(n, m);

		for(int i = 0; i < n; i++) {
			// 出力
			System.out.println(nKcal[i]);
		}
		sc.close();
	}

	private static int[] getNKcal(int n, int m) {
		// 各料理のカロリーを取得
		int[] mKcal = getMKcal(m);

		int[] nKcal = new int[n];
		// 各就活生のカロリーを計算する
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				// 各食べた量
				int amount = sc.nextInt();
				// カロリー合計値算出
				nKcal[i] += kcalSum(amount, mKcal[j]);
			}
		}
		return nKcal;
	}

	private static int[] getMKcal(int m) {
		int[] mKcal = new int[m];
		// 各カロリーを入力させる
		for(int i = 0; i < m; i++) {
			mKcal[i] = sc.nextInt();
		}
		return mKcal;
	}

	private static int kcalSum(int amount, int cal) {
		return amount * cal / 100;
	}
}
