package solveJava;

import java.util.Scanner;

public class PaiB11Kousi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 半径r
		double r = sc.nextDouble();

		// 半径rをInt型に変換
		int rInt = (int)Math.ceil(r);

		// 直径 x 直径の配列を作る
		boolean[][] circleArea = new boolean[rInt][rInt];

		// 円の内側のマス数
		int areaCount = 0;

		double cellDistance = 0;

		for(int i = 0; i < rInt; i++) {
			for(int j = 0; j < rInt; j++) {
				cellDistance = Math.sqrt(Math.pow(i, 2) + Math.pow(j, 2));

				// マスが円内に含まれるか判定する
				circleArea[i][j] = areaCellJudge(r, cellDistance);

				// true判定のマスを数える
				areaCount = areaCountCell(circleArea, areaCount, i, j);
			}
		}
		// 出力
		System.out.println(areaCount * 4);
	}

	private static boolean areaCellJudge(double r, double cellDistance) {
		if(cellDistance >= r) {
			return true;
		} else {
			return false;
		}
	}

	private static int areaCountCell(boolean[][] circleArea, int areaCount, int i, int j) {
		if(circleArea[i][j] == true) {
			areaCount += 1;
		}
		return areaCount;
	}
}
