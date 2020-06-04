package ryo;

import java.util.Scanner;

public class PaiC01Point {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 所持金
		int n = sc.nextInt();
		// 払う回数
		int m = sc.nextInt();

		// 残金とポイントの配列
		int[] allMoneyPoint = {n, 0};
		// 運賃入力
		for(int i = 0; i < m; i++) {
			// 運賃読込
			int payMoney = sc.nextInt();

			// 計算
			calculate(payMoney, allMoneyPoint);

			// 出力
			System.out.println(allMoneyPoint[0] + " " + allMoneyPoint[1]);
		}
		sc.close();
	}

	private static void calculate(int payMoney, int[] allMoneyPoint) {
		if(allMoneyPoint[1] >= payMoney) {
			allMoneyPoint[1] -= payMoney;
		} else {
			allMoneyPoint[0] -= payMoney;
			allMoneyPoint[1] += payMoney / 10;
		}
	}
}
