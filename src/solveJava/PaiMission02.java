package solveJava;

import java.util.Scanner;

public class PaiMission02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sumPrice = 0;

		for(int i = 0; i < n; i++) {
			// 必要な在庫数 T
			int t = sc.nextInt();
			// 現在の在庫数 S
			int s = sc.nextInt();
			// 商品1つあたりの価格 P
			int p = sc.nextInt();

			if(s < t) {
				int repleCount = t - s;
				int price = p * repleCount;

				sumPrice += price;
			}
		}

		System.out.println(sumPrice);

		sc.close();
	}
}
