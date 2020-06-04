package solveJava;

import java.util.Scanner;

public class PaiC01Point {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 所持金
		int n = sc.nextInt();
		// 払う回数
		int m = sc.nextInt();

		// 運賃入力
		int[] payMoney = new int[m];
		for(int i = 0; i < m; i++) {
			payMoney[i] = sc.nextInt();
		}

		// 残金とポイントを二次元配列に入れる
		int[][] allMoneyPoint = new int[m][2];
		int allMoney = n;
		int allPoint = 0;

		for(int i = 0; i < m; i++) {
			if(allPoint >= payMoney[i]) {
				allPoint = allPoint - payMoney[i];
			} else {
				allMoney -= payMoney[i];
				allPoint += payMoney[i] / 10;
			}
			allMoneyPoint[i][0] = allMoney;
			allMoneyPoint[i][1] = allPoint;
		}
		for(int i = 0; i < m; i++) {
			System.out.println(allMoneyPoint[i][0] + " " + allMoneyPoint[i][1]);
		}
		sc.close();
	}

}
