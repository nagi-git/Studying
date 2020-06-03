package solveJava;

import java.util.Scanner;

public class PaiB04Irumi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();

		// それぞれの木の電球の数を配列に入れる
		int[] lightCount = new int[n];
		for(int i = 0; i < n; i++) {
			lightCount[i] = sc.nextInt();
		}

		// 調べたい区間の数
		int q = sc.nextInt();

		// 調べたい区間の始点・終点を配列に入れる
		int[][] researchSec = new int[q][2];
		for(int i = 0; i < q; i++) {
			researchSec[i][0] = sc.nextInt();
			researchSec[i][1] = sc.nextInt();
		}

		// 平均値を調べて、足りない個数を足す
		int[] diftreeCount = new int[q];
		double[] sumLightCount = new double[q];
		double[] aveLightCount = new double[q];
		int[] roundAveLightCount = new int[q];
		for(int i = 0; i < q; i++) {
			diftreeCount[i] = researchSec[i][1] - researchSec[i][0];
			for(int j = researchSec[i][0] - 1; j < researchSec[i][1]; j++) {
				sumLightCount[i] += lightCount[j];
			}

			aveLightCount[i] = sumLightCount[i] / (diftreeCount[i] + 1);
			roundAveLightCount[i] = (int)Math.floor(aveLightCount[i]);

			// もし平均値がm個を上回っていなければ各電球数に（m - 平均値）を足す
			if(roundAveLightCount[i] < m) {
				for(int k = researchSec[i][0] - 1; k < researchSec[i][1]; k++) {
					lightCount[k] = lightCount[k] + (m - roundAveLightCount[i]);
				}
			}
		}

		// 出力
		for(int i = 0; i < n; i++) {
			if(i == (n - 1)) {
				System.out.print(lightCount[i]);
			} else {
				System.out.print(lightCount[i] + " ");
			}
		}
	}
}
