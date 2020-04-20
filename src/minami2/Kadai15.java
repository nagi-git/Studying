package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai15 {
	public static void main(String[] args)
	throws IOException{
		int time, time2, hour, min, sec;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("秒数入力=>");
		time = Integer.parseInt(br.readLine());
		hour = time / 3600;		time2 = time % 3600;
		min = time2 / 60;
		sec = time2 % 60;

		System.out.println(time + "秒は"+ hour +"時間"+ min +"分"+ sec +"秒です");
	}

}
