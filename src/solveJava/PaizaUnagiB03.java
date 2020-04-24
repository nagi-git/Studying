package solveJava;

import java.util.Scanner;

public class PaizaUnagiB03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int n = sc.nextInt();
		final int m = sc.nextInt();

		// 座席数分の配列を作る
		boolean[] seats = new boolean[n];
		// 座席に番号を振る
		for(int i = 0; i < n; i++) {
			seats[i] = true;
		}

		int groupNum = 0;
		for(groupNum = 0; groupNum < m; groupNum++) {
			// グループ情報を入力させる
			int groupTotal = sc.nextInt();
			int groupStart = sc.nextInt();

			if(isEmpty(seats, groupTotal, groupStart) == true) {
				int count = groupStart - 1;
				for(int down = groupStart - 1; count < (groupTotal + groupStart) - 1; down++) {
					count++;
					// 座る人の番号が座席配列数を超えたら配列0からのカウントにする
					if(down > (seats.length - 1)) {
						down -= seats.length;
					}
						seats[down] = false;
				}
			}
		}

		int downCount = 0;
		for(int i = 0; i < seats.length; i++) {
			if(seats[i] == false) {
				downCount++;
			}
		}
		System.out.println(downCount);
	}

	private static boolean isEmpty(boolean[] seats, int groupTotal, int groupStart) {
		boolean seatsEmpty = true;
		int count = groupStart - 1;
		for(int i = groupStart - 1; count < (groupTotal + groupStart) - 1; i++) {
			count++;
			if(i > (seats.length - 1)) {
				i -= seats.length;
			}
			if(seats[i] != true) {
				seatsEmpty = false;
			}
		}
		return seatsEmpty;
	}
}
