package ryo;

import java.util.Scanner;

public class PaiB10Usagi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// しげみの数
		int n = sc.nextInt();
		// うさぎの数
		int m = sc.nextInt();
		// ジャンプの数
		int k = sc.nextInt();

		// ウサギの位置
		int[] mPlace = new int[m];
		for(int i = 0; i < m; i++) {
			// 今のウサギの位置を入力
			mPlace[i] = sc.nextInt();
		}

		// ウサギがk回ジャンプする
		for(int i = 0; i < k; i++) {
			jump(mPlace, n);
		}

		for (int i = 0; i < m; i++) {
			System.out.println(mPlace[i]);
		}

		sc.close();
	}

	private static void jump(int[] mPlace, int n) {

		//  ウサギの数ループ
		for(int i = 0; i < mPlace.length; i++) {
			int current = mPlace[i];

			for (int target : nextTargets(current, n)) {
				if(isEmpty(mPlace, target)) {
					// 空いているしげみがあればmPlace[i]にtargetを代入し、終了
					mPlace[i] = target;
					break;
				}
			}
		}
	}

	private static int[] nextTargets(int current, int n) {
		int[] targets = new int[n - 1];

		// しげみの数、ジャンプをトライ（自分の場所は除くのでマイナス１）
		for(int i = 0; i < n - 1; i++) {
			// ジャンプ先
			targets[i] = ((current + i) % n) + 1;
		}
		return targets;
	}

	private static boolean isEmpty(int[] mPlace, int target) {
		for (int place : mPlace) {
			if (place == target) {
				return false;
			}
		}
		return true;
	}
}
