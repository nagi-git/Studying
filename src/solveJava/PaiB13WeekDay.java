package solveJava;

import java.util.Scanner;

public class PaiB13WeekDay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// year
		int y = sc.nextInt();
		// month
		int m = sc.nextInt();
		// day
		int d = sc.nextInt();

		// 1800年1月1日からの差分日数を算出
		int sumDays = calcDayCount(y, m, d);

		// 差分日数 % 7の値で曜日を算出
		String weekDay = whatWeekDay(sumDays);

		// 出力
		System.out.println(weekDay);

		sc.close();

	}

	private static String whatWeekDay(int sumDays) {
		int weekDayNum = (sumDays - 1) % 7;
		String weekDay = null;

		switch(weekDayNum) {
		case 0:
			weekDay = "水曜日";
			break;
		case 1:
			weekDay = "木曜日";
			break;
		case 2:
			weekDay = "金曜日";
			break;
		case 3:
			weekDay = "土曜日";
			break;
		case 4:
			weekDay = "日曜日";
			break;
		case 5:
			weekDay = "月曜日";
			break;
		case 6:
			weekDay = "火曜日";
			break;
		}

		return weekDay;
	}

	private static int calcDayCount(int y, int m, int d) {
		// 合計日数
		int sumDays = 0;
		// 「1800年1月」～「y年m月の前月」までの各月の日数合計を出す
		for (int yCount = 1800; yCount <= y; yCount++) {
			for (int mCount = 1; mCount <= 12; mCount++) {
				// y年m月だったらbreak
				if (yCount == y && mCount == m) {
					break;
				}
				// y年m月の日数を出す
				int monthDay = countMonthDay(yCount, mCount);

				// 求めた日数を加算する
				sumDays += monthDay;
			}
		}
		// 「y年m月の日数」＝「d日」を加算する
		sumDays += d;

		return sumDays;

	}

	private static int countMonthDay(int yCount, int mCount) {
		int monthDay = 0;

		// 1,3,5,7,8,10,12月なら31を返し、4,6,9,11月なら30を返す
		switch (mCount) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			monthDay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			monthDay = 30;
			break;
		case 2:
			// 2月なら閏年判定をして、閏年なら29、そうでなければ28を返す
			if(isLeapYear(yCount) == true) {
				monthDay = 29;
			} else {
				monthDay = 28;
			}
			break;
		}
		return monthDay;
	}

	private static boolean isLeapYear(int yCount) {
		if ((yCount % 4 == 0 && yCount % 100 != 0) || yCount % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
