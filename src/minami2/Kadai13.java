package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai13 {

	public static void main(String[] args) // TODO 自動生成されたメソッド・スタブ
	throws IOException{
		String name1, name2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("あなたの名前を入力=>");
		name1 = br.readLine();
		System.out.print("好きな人の名前を入力=>");
		name2 = br.readLine();
		System.out.println(name1 +"と"+ name2 +"はラブラブです。");
	}

}
