package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample30 {

	public static void main(String[] args) // TODO 自動生成されたメソッド・スタブ
	throws IOException{
		int money, n500, n100, n50, n10, n5, n1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("金額を入力してください=>");
		money = Integer.parseInt(br.readLine());
		System.out.println("入力金額 ="+ money);
		n500 = money / 500;		money = money % 500;
		n100 = money / 100;		money = money % 100;
		n50 = money / 50;		money = money % 50;
		n10 = money / 10;		money = money % 10;
		n5 = money / 5;
		n1 = money % 5;
		System.out.println("硬貨の種類：500 100 50 10 5 1");
		System.out.println("硬貨の枚数："+ n500 +" "+ n100 +" "+ n50 +" "+ n10 +" "+ n5 +" "+ n1);
	}

}
