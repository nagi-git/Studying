package minami2;

import java.text.DecimalFormat;

public class MultiplicationTable {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("00");
		int [][] mulTable = new int[9][9];

		for(int column = 0; column <= 8; column++) {
			System.out.print("\n" + (column + 1) + "|");
			for(int line = 0; line <= 8; line++) {
				mulTable[line][column] = (line + 1) * (column + 1);
				System.out.print(df.format(mulTable[line][column]) + " ");
			}
		}
	}

}
