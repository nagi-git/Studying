package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai14 {

	public static void main(String[] args) // TODO 自動生成されたメソッド・スタブ
	throws IOException{
		int apple, banana, orange, pear, total, tax;
		System.out.println("購入するものの個数を入力してください");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("りんごの個数=>");
		apple = Integer.parseInt(br.readLine());
		System.out.print("バナナの個数=>");
		banana = Integer.parseInt(br.readLine());
		System.out.print("オレンジの個数=>");
		orange = Integer.parseInt(br.readLine());
		System.out.print("なしの個数=>");
		pear = Integer.parseInt(br.readLine());
		System.out.println("--------------------------------------");

		total = apple * 100 + banana * 180 + orange * 80 + pear * 150;
		tax = (int)(total * 0.05);
		System.out.println("お買い上げありがとうございます。");
		System.out.println("売上金額は"+ total +"円です。");
		System.out.println("消費税は"+ tax +"円です。");
		System.out.println("お支払金額は"+ (total + tax) +"円です。");

	}

}
