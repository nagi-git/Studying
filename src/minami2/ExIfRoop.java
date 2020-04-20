package minami2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExIfRoop {

	public static void main(String[] args) throws IOException{
		String a = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.print(">");

			a = br.readLine();
			if(a.length() == 0) {
				System.out.print("未入力です");
			} else if(a == "Exit") {
				break;
			} else {
				System.out.print(a);
				continue;
			}
		}
	}
}
