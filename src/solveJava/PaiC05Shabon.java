package solveJava;

import java.util.Scanner;

public class PaiC05Shabon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 風が吹く回数
		int t = sc.nextInt();

		// 最初のX座標
		int x = sc.nextInt();

		// 最初のY座標
		int y = sc.nextInt();

		// 風の座標を入力させる
		int[] windZahyo =  {0, 0};
		int[] windZahyoNow = {x, y};
		int highestXZahyo = x;
		for(int i = 0; i < t; i++) {
			windZahyo[0] = sc.nextInt();
			windZahyo[1] = sc.nextInt();

			// 座標を足す
			windZahyoNow = sumWindZahyo(windZahyo, windZahyoNow);

			// 最大のｘ座標値
			highestXZahyo = judgeHighest(highestXZahyo, windZahyoNow);

			// シャボン玉が地面に着いたら終了
			if(windZahyoNow[1] <= 0) {
				break;
			}

		}
		// 出力
		System.out.println(highestXZahyo);

		sc.close();
	}

	private static int[] sumWindZahyo(int[] windZahyo, int[] windZahyoNow) {
		windZahyoNow[0] += windZahyo[0];
		windZahyoNow[1] += windZahyo[1];
		return windZahyoNow;
	}

	private static int judgeHighest(int highestXZahyo, int[] windZahyoNow) {
		if(windZahyoNow[0] > highestXZahyo) {
			return windZahyoNow[0];
		}
		return highestXZahyo;
	}

}
