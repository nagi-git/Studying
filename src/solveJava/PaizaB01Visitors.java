package solveJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaizaB01Visitors {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		// アクセスログが残っていた日数n
		int n = sc.nextInt();
		// キャンペーンを行った日数k
		int k = sc.nextInt();

		// n日間の訪問者数配列
		int[] visitorCount = new int[n];
		// 訪問者の数を入力（n日分）
		visitorCount = inputVisitor(n, visitorCount, sc);

		// k日間分の訪問者合計数の配列[n - k + 1]
		int[] visitorSumCount = new int[n - k + 1];
		// visitorSumCountを算出する
		visitorSumCount = visitorSum(visitorCount, n, k, visitorSumCount);

		// visitorSumCountの中でMaxの値
		int visitorSumMax = 0;
		// visitorSumMaxを求める
		visitorSumMax = sortVisitorSumMax(visitorSumCount, visitorSumMax);

		// visitorSumMaxになるindex値を入れたリスト
		List<Integer> visitorSumMaxStartDay = new ArrayList<>();
		// visitorSumMaxStartDayを求める
		visitorSumMaxStartDay = visitorSumMaxStartDaySort(visitorSumCount, visitorSumMax, visitorSumMaxStartDay);

		// 候補日の数を出力
		System.out.print(visitorSumMaxStartDay.size() + " ");
		// 候補日の最初の日を出力
		System.out.print(visitorSumMaxStartDay.get(0) + 1);

		sc.close();

	}

	/**
	 * 訪問者の数を入力するメソッド（n日分）
	 * @param n アクセスログが残っていた日数n
	 * @param visitorCount n日間の訪問者数配列
	 * @param sc 標準入力
	 * @return 訪問者数を入力した配列
	 */
	private static int[] inputVisitor(int n, int[] visitorCount, Scanner sc) {
		for(int i = 0; i < n; i++) {
			visitorCount[i] = sc.nextInt();
		}
		return visitorCount;
	}

	/**
	 * k日間分の訪問者合計を求める((n - k + 1)回分)
	 * @param visitorCount n日間の訪問者数配列
	 * @param n アクセスログが残っていた日数n
	 * @param k キャンペーンを行った日数k
	 * @param visitorSumCount k日間分の訪問者合計数の配列
	 * @return k日間分の訪問者合計数を算出した配列
	 */
	private static int[] visitorSum(int[] visitorCount, int n, int k, int[] visitorSumCount) {
		for(int i = 0; i < (n - k + 1); i++) {
			for(int j = i; j < (k + i); j++) {
				visitorSumCount[i] += visitorCount[j];
			}
		}
		return visitorSumCount;
	}

	/**
	 * 訪問者合計値の中でMax値を求める
	 * @param visitorSumCount k日間分の訪問者合計数の配列
	 * @param visitorSumMax visitorSumCount中のMax値
	 * @return 求めたMax値
	 */
	private static int sortVisitorSumMax(int[] visitorSumCount, int visitorSumMax) {
		for(int i = 0; i < visitorSumCount.length; i++) {
			if(visitorSumCount[i] > visitorSumMax) {
				visitorSumMax = visitorSumCount[i];
			}
		}
		return visitorSumMax;
	}

	/**
	 * visitorSumCountの中でvisitorSumMaxになるインデックスをリストに保存する
	 * @param visitorSumCount k日間分の訪問者合計数の配列
	 * @param visitorSumMax visitorSumCount中のMax値
	 * @param visitorSumMaxStartDay visitorSumCountの中でvisitorSumMaxになるインデックス
	 * @return インデックスが入ったリストを返す
	 */
	private static List<Integer> visitorSumMaxStartDaySort(int[] visitorSumCount, int visitorSumMax, List<Integer> visitorSumMaxStartDay) {
		for(int i = 0; i < visitorSumCount.length; i++) {
			if(visitorSumCount[i] == visitorSumMax) {
				visitorSumMaxStartDay.add(i);
			}
		}
		return visitorSumMaxStartDay;
	}
}
