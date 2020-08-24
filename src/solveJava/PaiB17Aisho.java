package solveJava;

import java.util.Scanner;

public class PaiB17Aisho {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// s
		String s = sc.next();
		// t
		String t = sc.next();

		// 名前を1文字ずつ抜き出す
		String[] sArray = s.split("");
		String[] tArray = t.split("");

		// 名前配列同士を足す(2パターン)
		String[] s_tArray = addName(sArray, tArray);
		String[] t_sArray = addName(tArray, sArray);

		// 名前を数字に変換(2パターン)
		int[] s_tNumArray = convNum(s_tArray);
		int[] t_sNumArray = convNum(t_sArray);

		// 相性を計算する(2パターン)
		int[] matchNumS_t = matchNumCalc(s_tNumArray);
		int[] matchNumT_s = matchNumCalc(t_sNumArray);

		// 大きい方を出力
		if(matchNumS_t[0] < matchNumT_s[0]) {
			System.out.println(matchNumT_s[0]);
		}else {
			System.out.println(matchNumS_t[0]);
		}
		sc.close();
	}

	private static int[] matchNumCalc(int[] convNumArray) {
		int[] matchNumArray = new int[convNumArray.length - 1];
		for(int i = 0; 1 <= convNumArray.length; i++) {
			matchNumArray = matchNumArrayCalc(matchNumArray, convNumArray, i);
			convNumArray = matchNumArray;
			if(convNumArray.length == 1) {
				break;
			}
			matchNumArray = new int[matchNumArray.length - 1];
		}
		return convNumArray;
	}

	private static int[] matchNumArrayCalc(int[] matchNumArray, int[] convNumArray, int i) {
		for(int j = 0; j < matchNumArray.length; j++) {
			matchNumArray[j] = convNumArray[j] + convNumArray[j + 1];
			if(matchNumArray[j] > 100) {
				matchNumArray[j] -= 101;
			}
		}
		return matchNumArray;
	}

	private static int[] convNum(String[] addNameArray) {
		int[] convNumArray = new int[addNameArray.length];
		for(int i = 0; i < addNameArray.length; i++) {
			switch(addNameArray[i]) {
			case "a":
				convNumArray[i] = 1;
				break;
			case "b":
				convNumArray[i] = 2;
				break;
			case "c":
				convNumArray[i] = 3;
				break;
			case "d":
				convNumArray[i] = 4;
				break;
			case "e":
				convNumArray[i] = 5;
				break;
			case "f":
				convNumArray[i] = 6;
				break;
			case "g":
				convNumArray[i] = 7;
				break;
			case "h":
				convNumArray[i] = 8;
				break;
			case "i":
				convNumArray[i] = 9;
				break;
			case "j":
				convNumArray[i] = 10;
				break;
			case "k":
				convNumArray[i] = 11;
				break;
			case "l":
				convNumArray[i] = 12;
				break;
			case "m":
				convNumArray[i] = 13;
				break;
			case "n":
				convNumArray[i] = 14;
				break;
			case "o":
				convNumArray[i] = 15;
				break;
			case "p":
				convNumArray[i] = 16;
				break;
			case "q":
				convNumArray[i] = 17;
				break;
			case "r":
				convNumArray[i] = 18;
				break;
			case "s":
				convNumArray[i] = 19;
				break;
			case "t":
				convNumArray[i] = 20;
				break;
			case "u":
				convNumArray[i] = 21;
				break;
			case "v":
				convNumArray[i] = 22;
				break;
			case "w":
				convNumArray[i] = 23;
				break;
			case "x":
				convNumArray[i] = 24;
				break;
			case "y":
				convNumArray[i] = 25;
				break;
			case "z":
				convNumArray[i] = 26;
				break;
			default:
				convNumArray[i] = 0;
				break;
			}
		}
		return convNumArray;
	}

	private static String[] addName(String[] name1Array, String[] name2Array) {
		String[] addNameArray = new String[name1Array.length + name2Array.length];
		for(int i = 0; i < name1Array.length; i++) {
			addNameArray[i] = name1Array[i];
		}
		for(int j = name1Array.length; j < addNameArray.length; j++) {
			addNameArray[j] = name2Array[j - name1Array.length];
		}
		return addNameArray;
	}

}
