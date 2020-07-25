package solveJava;

import java.util.Scanner;

public class PaiMission03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		int n = sc.nextInt();

		int[] mArray = new int[n];

		mArrayAdd(mArray, n, sc);

		int m_tSumValue = 0;

		int highM_tSumValue = 0;

		for(int count = 0; count < n - t + 1; count++) {
			m_tSumValue = m_tSum(mArray, t, count, m_tSumValue);

			highM_tSumValue = m_tSumValueJudge(highM_tSumValue, m_tSumValue);
		}

		System.out.println(highM_tSumValue);

		sc.close();
	}

	private static int m_tSumValueJudge(int highM_tSumValue, int m_tSumValue) {
		if(highM_tSumValue < m_tSumValue) {
			highM_tSumValue = m_tSumValue;
		}
		return highM_tSumValue;
	}

	private static int m_tSum(int[] mArray, int t, int count, int m_tSumValue) {
		m_tSumValue = 0;
		for(int i = count; i < count + t; i++) {
			m_tSumValue += mArray[i];
		}
		return m_tSumValue;
	}

	private static int[] mArrayAdd(int[] mArray, int n, Scanner sc) {
		for(int i = 0; i < n; i++) {
			mArray[i] = sc.nextInt();
		}
		return mArray;
	}
}
