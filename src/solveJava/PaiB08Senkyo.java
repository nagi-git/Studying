package solveJava;

import java.util.Scanner;

public class PaiB08Senkyo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 立候補者の数
		int m = sc.nextInt();
		// 有権者の数
		int n = sc.nextInt();
		// 演説が行われる回数
		int k = sc.nextInt();

		// 演説を行う立候補者の番号
		int speechNum = 0;
		// 各候補者を支持する有権者の数
		int[] mSupport = new int[m + 1];
		mSupport[m] = n;
		// 有権者が一番多い候補者の有権者の数
		int mostSupport = 0;

		// 演説をk回行う
		for(int i = 0; i < k; i++) {
			// 演説を行う立候補者の番号を入力
			speechNum = sc.nextInt();

			// スピーチを行う
			mSupport = doSpeech(m, n, speechNum, mSupport);

		}
		// 有権者が一番多い候補者の有権者の数を求める
		mostSupport = mostSupportJudge(mostSupport, mSupport, m);

		// 出力
		for(int i = 0; i < m; i++) {
			if(mostSupport == mSupport[i]) {
				System.out.println(i + 1);
			}
		}
	}

	private static int mostSupportJudge(int mostSupport, int[] mSupport, int m) {
		for(int i = 0; i < m; i++) {
			if(mostSupport < mSupport[i]) {
				mostSupport = mSupport[i];
			}
		}
		return mostSupport;
	}

	private static int[] doSpeech(int m, int n, int speechNum, int[] mSupport) {
		int otherMSupport = 0;
		for(int i = 0; i < m + 1; i++) {
			if(speechNum - 1 != mSupport[i] && mSupport[i] > 0) {
				otherMSupport += 1;
				mSupport[i] -= 1;
			}
		}
		mSupport[speechNum - 1] += otherMSupport;

		return mSupport;
	}
}
