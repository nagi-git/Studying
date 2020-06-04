package solveJava;

import java.util.Scanner;

public class PaiC07Kaimono {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 商品の数
		int n = sc.nextInt();

		// 商品内容を配列に入れる
		int[] goods = new int[2];

		// 商品ごとの合計金額値
		int[] allGoodsMoney = new int[4];

		for(int i = 0; i < n; i++) {
			goods[0] = sc.nextInt();
			goods[1] = sc.nextInt();

			// 商品ごとの合計金額値を計算
			allGoodsMoney = goodsMoneySum(allGoodsMoney, goods);

		}
		// 商品のポイントを計算
		int allPoint = pointSum(allGoodsMoney);

		// 出力
		System.out.println(allPoint);

		sc.close();
	}

	private static int[] goodsMoneySum(int[] allGoodsMoney, int[] goods) {
		// 合計金額を計算
		if(goods[0] == 0) {
			allGoodsMoney[0] += goods[1];
		} else if(goods[0] == 1) {
			allGoodsMoney[1] += goods[1];
		} else if(goods[0] == 2) {
			allGoodsMoney[2] += goods[1];
		} else if(goods[0] == 3) {
			allGoodsMoney[3] += goods[1];
		}
		return allGoodsMoney;
	}

	private static int pointSum(int[] allGoodsMoney) {
		int allPoint = 0;
		for(int i = 0; i < 4; i++) {
			if(i == 0) {
				allPoint += allGoodsMoney[0] / 100 * 5;
			} else if(i == 1) {
				allPoint += allGoodsMoney[1] / 100 * 3;
			} else if(i == 2) {
				allPoint += allGoodsMoney[2] / 100 * 2;
			} else if(i == 3) {
				allPoint += allGoodsMoney[3] / 100 * 1;
			}
		}
		return allPoint;
	}

}
