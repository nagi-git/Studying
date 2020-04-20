package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample25 {

	public static void main(String[] args)
		// TODO 自動生成されたメソッド・スタブ
	throws IOException{
		int height, width, area;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("縦の長さを入力してください");
		height = Integer.parseInt(br.readLine());
		System.out.println("横の長さを入力してください");
		width = Integer.parseInt(br.readLine());

		area = height * width;
		System.out.println("面積は"+ area);
	}
}

