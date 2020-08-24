package minami2;

import java.util.Calendar;
import java.util.Scanner;

public class PaiB15Yokueigyobi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// M
		int month = sc.nextInt();
		// D
		int day = sc.nextInt();
		// d
		String d = sc.next();

		// Calendarクラスを使って日付をセットする
		Calendar cal = Calendar.getInstance();
		cal.set(2019, month, day);

		// 入力日に1日足す(FRIの場合は+3、SATの場合は+2)
		if(d == "FRI") {
			cal.add(Calendar.DATE, 3);
		} else if(d == "SAT") {
			cal.add(Calendar.DATE, 2);
		} else {
			cal.add(Calendar.DATE, 1);
		}

		// 祝日だったら



		dispCalendar(cal);

		sc.close();

	}

	private static void dispCalendar(Calendar cal) {
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
	}

}
