package solveJava;

import java.util.Scanner;

public class PaiC08Osyokuji {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 料理の品数
		int m = sc.nextInt();
		// 就活性の人数
		int n = sc.nextInt();

		// 各料理のカロリーの配列
		int[] mKcal = new int[m];
		// 各カロリーを入力させる
		for(int i = 0; i < m; i++) {
			mKcal[i] = sc.nextInt();
		}

		int[] nAmount = new int[m];
		int[] nKcal = new int[n];
		// 各就活生のカロリーを計算する
		for(int i = 0; i < n; i++) {

			// 各食べた量を入力させる
			for(int j = 0; j < m; j++) {
				nAmount[j] = sc.nextInt();
			}

			// カロリー合計値算出
			nKcal[i] = kcalSum(nAmount, mKcal, m);

			// 出力
			System.out.println(nKcal[i]);
		}
	}

	private static int kcalSum(int[] nAmount, int[] mKcal, int m) {
		int nKcalSum = 0;
		for(int i = 0; i < m; i++) {
			nKcalSum += nAmount[i] * mKcal[i] / 100;
		}
		return nKcalSum;
	}
}
