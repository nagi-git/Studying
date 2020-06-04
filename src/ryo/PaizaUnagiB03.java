package ryo;

import java.util.Scanner;

public class PaizaUnagiB03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		final int m = sc.nextInt();

		// 座席数分の配列を作る （true: 空き）
		boolean[] seats = new boolean[n];
		// FIXME 座席に番号を振る
		for(int i = 0; i < n; i++) {
			seats[i] = true;
		}

		for(int groupNum = 0; groupNum < m; groupNum++) {
			// グループ情報を入力させる
			int groupTotal = sc.nextInt();
			int groupStart = sc.nextInt();
			int startSeatIndex = groupStart - 1;

			if(isEmpty(seats, groupTotal, startSeatIndex)) {
				for(int down = startSeatIndex; down < (groupTotal + startSeatIndex); down++) {
					seats[down % seats.length] = false;
				}
			}
		}

		int downCount = 0;
		for(int i = 0; i < seats.length; i++) {
			if(!seats[i]) {
				downCount++;
			}
		}
		System.out.println(downCount);
		sc.close();
	}

	private static boolean isEmpty(boolean[] seats, int groupTotal, int startSeatIndex) {
		for(int i = startSeatIndex; i < (groupTotal + startSeatIndex); i++) {
			if(!seats[i % seats.length]) {
				return false;
			}
		}
		return true;
	}
}
