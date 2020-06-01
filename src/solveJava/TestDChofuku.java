package solveJava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDChofuku {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCount = sc.nextInt();
		List inputArray = inputNum(numCount);
		boolean[] isSeriesNum = new boolean[numCount];
		int[] doubleCount = new int[numCount];

		// 1～numCountまでの数値で存在しない数字はfalseにする
		for(int i = 1; i <= numCount; i++) {
			for(int j = 0; j < numCount; j++) {
				if(inputArray.get(j) == i) {
					isSeriesNum[j] = true;
				}else {
					isSeriesNum[j] = false;
				}
			}
		}

		// 同じ数字があったらdoubleCountに1増やす
		for(int i = 0; i < numCount; i++) {
			for(int j = i + 1; j < numCount; i++) {
				if(inputArray[i] == inputArray[j]) {
					doubleCount[i] += 1;
				}
			}
		}
	}

	public static List inputNum(int numCount) {
		Scanner sc = new Scanner(System.in);
		List<Integer> inputArray = new ArrayList<>();
		for(int i = 0; i < numCount; i++) {
			inputArray.add(sc.nextInt());
		}
		return inputArray;
	}

}
