package solveJava;

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
		// ウサギがいるかの判定
		boolean[] isEmpty = new boolean[n];
		for(int i = 0; i < m; i++) {
			// 今のウサギの位置を入力
			mPlace[i] = sc.nextInt();

			// ウサギがいたらtrue
			isEmpty[mPlace[i] - 1] = true;
		}

		// ウサギがk回ジャンプする
		for(int i = 0; i < k; i++) {
			for(int o = 0; o < m; o++) {
				boolean jampSuccess = false;
				for(int j = mPlace[o]; j < n; j++) {
					if(!isEmpty[j]) {
						isEmpty[mPlace[o] - 1] = false;
						mPlace[o] = j + 1;
						isEmpty[j] = true;
						jampSuccess = true;
						break;
					}
				}
				if(jampSuccess == false) {
					for(int j = 0; j < n; j++) {
						if(!isEmpty[j]) {
							isEmpty[mPlace[o] - 1] = false;
							mPlace[o] = j + 1;
							isEmpty[j] = true;
							jampSuccess = true;
							break;
						}
					}
				}
			}
		}
		for(int i = 0; i < m; i++) {
			System.out.println(mPlace[i]);
		}

		sc.close();
	}
}
