package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample27 {

	public static void main(String[] args) // TODO 自動生成されたメソッド・スタブ
	throws IOException{
		int money;
		double money1, money2, money3;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("金額の入力 = >");
		money = Integer.parseInt(br.readLine());
		money1 = 1.05 * money;
		money2 = 1.05 * money1;
		money3 = 1.05 * money2;
		System.out.println("1年後の元利合計は"+ money1);
		System.out.println("2年後の元利合計は"+ money2);
		System.out.println("3年後の元利合計は"+ money3);

	}

}
