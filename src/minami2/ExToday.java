package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class ExToday {

	public static void main (String[] args) throws IOException {
		Calendar today = Calendar.getInstance();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("何月？==>");
		String strMonth = br.readLine();
		int inputMonth = Integer.parseInt(strMonth);

		System.out.print("何日？==>");
		String strDay = br.readLine();
		int inputDay = Integer.parseInt(strDay);

		int todayMonth = today.get(Calendar.MONTH) + 1;
		int todayDay = today.get(Calendar.DATE);

		if(todayMonth == inputMonth && todayDay == inputDay) {
				System.out.println("正解！！");
		} else {
			System.out.println("間違っています");
		}
	}

}
