package solveJava;

import java.util.Scanner;

public class PaiC03Maturi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 今日の日付(y/m/d)
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();

		// 次の祭りの日付（年はわからない）
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 次の祭りの年を求める
		int nextY = 0;
		if(y % 4 == 0) {
			nextY = y + 1;
		} else {
			nextY = y + (5 - y % 4);
		}

		// 次の祭り開催年までの日数を出す
		int nextDayCount = 0;
		for(int i = 1; i <= (nextY - y) + 1; i++) {
			if(i == 1) {
				for(int j = m + 1; j <= 13; j++) {
					if(j % 2 == 0) {
						nextDayCount += 15;
					} else if(j % 2 == 1) {
						nextDayCount += 13;
					}
				}
			}else if(i == (nextY - y) + 1) {
				for(int j = 1; j <= a - 1; j++) {
					if(j % 2 == 0) {
						nextDayCount += 15;
					} else if(j % 2 == 1) {
						nextDayCount += 13;
					}
				}
			}else {
				nextDayCount += 181;
			}
		}
		if(m % 2 == 0) {
			nextDayCount = nextDayCount + (15 - d) + b;
		}else {
			nextDayCount = nextDayCount + (13 - d) + b;
		}
		System.out.println(nextDayCount);
	}

}
