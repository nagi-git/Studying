package solveJava;

import java.util.Scanner;

public class PaiB03Syussya {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();

		int[][] trainTime = new int[n][2];
		for(int i = 0; i < n; i++) {
			trainTime[i][0] = sc.nextInt();
			trainTime[i][1] = sc.nextInt();
		}

		int timeCoArrival = 8 * 60 + 59;
		int timeStaArrival = timeCoArrival - (b + c);

		int[] timeTrainArray = new int[n];
		int hours = 0;
		int minutes = 0;
		for(int i = 0; i < n; i++) {
			hours = trainTime[i][0];
			minutes = trainTime[i][1];
			timeTrainArray[i] = hours * 60 + minutes;
		}

		int[] timeStaTrainDiff = new int[n];
		int timeGoTrainTime = timeTrainArray[0];
		for(int i = 0; i < n; i++) {
			timeStaTrainDiff[i] = timeStaArrival - timeTrainArray[i];
			if(timeStaTrainDiff[i] >= 0) {
				if(timeGoTrainTime > timeStaTrainDiff[i]) {
					timeGoTrainTime =  timeTrainArray[i];
				}
			}
		}

		int timeGohome = timeGoTrainTime - a;

		System.out.println(String.format("%02d",((timeGohome - timeGohome % 60) / 60)) + ":" + String.format("%02d",(timeGohome % 60)));
		sc.close();
	}
}
