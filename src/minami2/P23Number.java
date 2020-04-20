package minami2;

public class P23Number {
	public static void main(String args[]) {
		int[][] a = {
				{1, 2, 3},
				{4, 5}
		};
		int b = a.length;
		System.out.println(b);
		System.out.println(a[1].length);
		System.out.println(0x10);


		int c, d = 2;

		for(c = 0; c < 5; c++) {
			if(d - c <= 0)
				break;
			System.out.println(d + "-" + c + "=" + (d - c));
		}
	}
}
