package solveJava;

import java.util.Scanner;

public class PaiB14WeekDayLarge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// year
		long y = sc.nextLong();
		// month
		int m = sc.nextInt();
		// day
		int d = sc.nextInt();

		// 1800年1月1日からの差分日数を算出
		long sumDays = calcDayCount(y, m, d);

		// 差分日数 % 7の値で曜日を算出
		String weekDay = whatWeekDay(sumDays);

		// 出力
		System.out.println(weekDay);

		sc.close();

	}

	private static long calcDayCount(long y, int m, int d) {
		// 400年間の全日数
		int years400Days = 366 * 97 + 365 * 303;

		// 400年周期の数
		long years400Count = (y - 1800) / 400;

		// 400年周期で割り切れる年数（years400Count * 400 +1800）
		long remainYears400Count = years400Count * 400 + 1800;

		// y年m月d日までの合計日数を求める
		long sumDays = years400Days + calcDayCount(remainYears400Count, y, m, d);

		return sumDays;
	}

	private static long calcDayCount(long remainYears400Count, long y, int m, int d) {
		// 合計日数
		int sumDays = 0;
		// 「1800年1月」～「y年m月の前月」までの各月の日数合計を出す
		for (long yCount = remainYears400Count; yCount <= y; yCount++) {
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

	private static String whatWeekDay(long sumDays) {
		int weekDayNum = (int) ((sumDays - 1) % 7);
		String weekDay = null;

		switch (weekDayNum) {
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

	private static int countMonthDay(long yCount, int mCount) {
		// 1,3,5,7,8,10,12月なら31を返し、4,6,9,11月なら30を返す
		switch (mCount) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			return 31;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		case 2:
			// 2月なら閏年判定をして、閏年なら29、そうでなければ28を返す
			if (isLeapYear(yCount) == true) {
				return 29;
			} else {
				return 28;
			}
		default:
			return 0;
		}
	}

	private static boolean isLeapYear(long yCount) {
		if ((yCount % 4 == 0 && yCount % 100 != 0) || yCount % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
