package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kadai12 {

	public static void main(String[] args) // TODO 自動生成されたメソッド・スタブ
	throws IOException{
		double weight, height, BMI;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("体重入力=>");
		weight = Double.parseDouble(br.readLine());
		System.out.print("身長入力=>");
		height = Double.parseDouble(br.readLine());

		BMI = weight / (height * height);
		System.out.println("体重"+ weight +"kg,身長"+ height +"mの人の肥満指数");
		System.out.println("BMIは"+ BMI +"です。");
		System.out.println("BMI=18.5以下は低体重,30以上は肥満,18.5～30は標準です。");

	}

}
