package ryo;

import java.util.Scanner;

public class PaiC07Kaimono {

	private final static  int[] RATIO = {5, 3, 2, 1};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 商品の数
		int n = sc.nextInt();

		// 商品ごとの合計金額値
		int[] allGoodsMoney = new int[商品種類.values().length];
		for(int i = 0; i < n; i++) {
			商品種類 goodsKind = 商品種類.of(sc.nextInt());
			int amount = sc.nextInt();

			// 商品ごとの合計金額値を計算
			allGoodsMoney = goodsMoneySum(allGoodsMoney, goodsKind, amount);
		}

		// 商品のポイントを計算
		int allPoint = pointSum(allGoodsMoney);

		// 出力
		System.out.println(allPoint);

		sc.close();
	}

	private static int[] goodsMoneySum(int[] allGoodsMoney, 商品種類 goodsKind, int amount) {
		// 合計金額を計算
		int code = goodsKind.code;
		allGoodsMoney[code] += amount;
		return allGoodsMoney;
	}

	private static int pointSum(int[] allGoodsMoney) {
		int allPoint = 0;
		for(int i = 0; i < 商品種類.values().length; i++) {
			allPoint += (allGoodsMoney[i] / 100) * RATIO[i];
		}
		return allPoint;
	}

	private enum 商品種類 {
		食料品(0),
		書籍(1),
		衣類(2),
		その他(3),
		;

		private int code;

		private 商品種類(int code) {
			this.code = code;
		}

		public static 商品種類 of(int code) {
			for (商品種類 e : 商品種類.values()) {
				if (e.code == code) {
					return e;
				}
			}
			return null;
		}
	}
}
