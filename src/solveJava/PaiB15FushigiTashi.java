package solveJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PaiB15FushigiTashi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// s_1
		String s_1 = sc.next();
		// s_2
		String s_2 = sc.next();

		// 5進数の数字を配列に入れる
		// "A" が 0、"B" が 1、"C" が 2、"D" が 3、"E" が 4 を表す
		int[] quinaryS_1 = convQuinary(s_1);
		int[] quinaryS_2 = convQuinary(s_2);

		// 10進数表記で計算する
		int decimalS_1 = calcDecimalNum(quinaryS_1);
		int decimalS_2 = calcDecimalNum(quinaryS_2);

		// 10進数表記でS_1,S_2を足す
		int decimalSSum = decimalS_1 + decimalS_2;

		System.out.println(decimalSSum);

		// decimalSSumを5進数表記に変換して配列に入れる
		List<Integer> quinaryArray = conv2Quinary(decimalSSum);

		// アルファベットに変換する
		List<String> quinaryStr = convQuinaryStr(quinaryArray);

		// 出力
		for(int i = quinaryStr.size() - 1; i >= 0; i--) {
			System.out.print(quinaryStr.get(i));
		}
		sc.close();
	}

	private static List<String> convQuinaryStr(List<Integer> quinaryArray) {
		List<String> quinaryStr = new ArrayList<>();
		for(int i = 0; i < quinaryArray.size(); i++) {
			switch(quinaryArray.get(i)) {
			case 0:
				quinaryStr.add("A");
				break;
			case 1:
				quinaryStr.add("B");
				break;
			case 2:
				quinaryStr.add("C");
				break;
			case 3:
				quinaryStr.add("D");
				break;
			case 4:
				quinaryStr.add("E");
				break;
			default:
				break;
			}
		}
		return quinaryStr;
	}

	private static List<Integer> conv2Quinary(int decimalSSum) {
		List<Integer> quinaryArray = new ArrayList<>();
		int remain = 0;
		for(int i = 0; 5 < decimalSSum; i++) {
			remain = decimalSSum % 5;
			quinaryArray.add(remain);
			decimalSSum = decimalSSum / 5;
		}
		quinaryArray.add(decimalSSum);
		return quinaryArray;
	}

	private static int calcDecimalNum(int[] quinaryS) {
		int decimalSum = 0;
		for(int i = 0; i < quinaryS.length; i++) {
			int decimalNum = (int)Math.pow(5, quinaryS.length - i - 1) * quinaryS[i];
			decimalSum += decimalNum;
		}
		return decimalSum;
	}

	private static int[] convQuinary(String s) {
		String[] sArray = s.split("");
		int[] quinaryNum = new int[s.length()];
		for(int i = 0; i < sArray.length; i++) {
			switch(sArray[i]) {
			case "A":
				quinaryNum[i] = 0;
				break;
			case "B":
				quinaryNum[i] = 1;
				break;
			case "C":
				quinaryNum[i] = 2;
				break;
			case "D":
				quinaryNum[i] = 3;
				break;
			case "E":
				quinaryNum[i] = 4;
				break;
			default:
				quinaryNum[i] = 0;
			}
		}
		return quinaryNum;
	}
}