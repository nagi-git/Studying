package ryo;

import java.util.Scanner;

public class PaiB11Kousi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 半径r
		double r = sc.nextDouble();

		// 円の内側のマス数
		int areaCountOnQuater = 0;

		for(int x = 0; isInCircle(r, x, 0); x++) {
			for(int y = 0; isInCircle(r, x, y); y++) {
				areaCountOnQuater++;
			}
		}
		// 出力
		System.out.println(areaCountOnQuater * 4);
	}

	public static void main_old(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 半径r
		double r = sc.nextDouble();

		// 円の内側のマス数
		int areaCountOnQuater = 0;

		for(int x = 0; isInCircle(r, x, 0); x++) {
			for(int y = 0; isInCircle(r, x, y); y++) {
				areaCountOnQuater++;
			}
		}
		// 出力
		System.out.println(areaCountOnQuater * 4);
	}

	private static boolean isInCircle(double r, int x, int y) {
		double cellDistance = calcDistance(x, y);
		return cellDistance < r;
	}

	private static double calcDistance(double x, double y) {
		return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
	}

}
