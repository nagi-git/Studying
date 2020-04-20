package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai11 {

	public static void main(String[] args) // TODO 自動生成されたメソッド・スタブ
	throws IOException{
		double r, l, a;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("半径を整数で入力してください");
		r = Double.parseDouble(br.readLine());

		l = 2 * r * 3.14;
		a = r * r * 3.14;

		System.out.println("半径は"+ r);
		System.out.println("円周は"+ l);
		System.out.println("面積は"+ a);
	}

}
