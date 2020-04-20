package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample26 {

	public static void main(String[] args) // TODO 自動生成されたメソッド・スタブ
	throws IOException{
		String name;
		int age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("名前を入力してください");
		name = br.readLine();
		System.out.println(name +"さんは、何歳ですか？");
		age = Integer.parseInt(br.readLine());
		System.out.println(name + "さんは若く見えますね");
		System.out.println((age - 5) + "歳くらいだと思いました");
	}

}
