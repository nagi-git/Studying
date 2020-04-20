package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai10 {

	public static void main(String[] args) // TODO 自動生成されたメソッド・スタブ
	throws IOException{
		int a, b, c, sum;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("1番目の整数を入力=>");
		a = Integer.parseInt(br.readLine());

		System.out.print("2番目の整数を入力=>");
		b = Integer.parseInt(br.readLine());

		System.out.print("3番目の整数を入力=>");
		c = Integer.parseInt(br.readLine());

		sum = a + b + c;
		System.out.println("整数"+ a +"と"+ b +"と"+ c +"の和は"+ sum);

	}

}
