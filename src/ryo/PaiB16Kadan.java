package ryo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaiB16Kadan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// h
		int h = sc.nextInt();
		// w
		int w = sc.nextInt();

		// 花壇とその他の地図を入力→配列に入れる
		String[][] parkMaps = new String[h][w];

		for (int i = 0; i < h; i++) {
			String parkMap = sc.next();
			for (int j = 0; j < w; j++) {
				// 配列に変換
				parkMaps[i][j] = parkMap.substring(j, j + 1);
			}
		}

		// 隣り合う花壇の数を数えるリスト
		List<Integer> nextFlower = new ArrayList<>();

		for (int hCount = 0; hCount < h; hCount++) {
			for (int wCount = 0; wCount < w; wCount++) {
				// 花壇かどうかの判定
				if (isFlower(parkMaps[hCount][wCount])) {
					// 花壇があったら前後左右、花壇が隣り合っている数をカウント
					nextFlower.add(nextFlowerCount(parkMaps, hCount, wCount));
				}
			}
		}

		// 花壇が隣あっている数からロープの数を求める
		int lopeSum = lopeCount(nextFlower);

		System.out.println(lopeSum);

		sc.close();
	}

	private static int lopeCount(List<Integer> nextFlower) {
		// 花壇が1つも隣り合わない場合ロープ4つ
		// 花壇が1つ隣り合う場合はロープ3つ
		// 花壇が2つ隣り合う場合はロープ2つ
		// 花壇が3つ隣り合う場合はロープ1つ
		// 花壇が4つ隣り合う場合はロープ0
		int lopeSum = 0;
		for (int i = 0; i < nextFlower.size(); i++) {
			switch (nextFlower.get(i)) {
			case 0:
				lopeSum += 4;
				break;
			case 1:
				lopeSum += 3;
				break;
			case 2:
				lopeSum += 2;
				break;
			case 3:
				lopeSum += 1;
				break;
			case 4:
				lopeSum += 0;
				break;
			default:
				break;
			}
		}
		return lopeSum;
	}

	private static int nextFlowerCount(String[][] parkMaps, int hCount, int wCount) {
		int nextFlowerCount = 0;
		if (hCount > 0 && parkMaps[hCount - 1][wCount].equals("#")) {
			nextFlowerCount += 1;
		}
		if (wCount > 0 && parkMaps[hCount][wCount - 1].equals("#")) {
			nextFlowerCount += 1;
		}
		if (hCount < parkMaps.length - 1 && parkMaps[hCount + 1][wCount].equals("#")) {
			nextFlowerCount += 1;
		}
		if (wCount < parkMaps[hCount].length - 1 && parkMaps[hCount][wCount + 1].equals("#")) {
			nextFlowerCount += 1;
		}

		return nextFlowerCount;
	}

	private static boolean isFlower(String parkMap) {
		return parkMap.equals("#");
	}
}
