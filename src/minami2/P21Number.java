package minami2;

public class P21Number {

	public static void main(String[] args) {
		int[][] a = {
			{10, 20, 30},
			{40, 50, 60}
		};
		a[0][2] = 0;
		System.out.println(a[1][0]);
	}
}
