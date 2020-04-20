package minami2;

public class P81VarargsSample {
	int getMax(int... nums) {
		int max = 0;
		for(int i = 0; i < nums.length; i++) {
			if(i == 0) {
				max = nums[0];
			}
			if(max < nums[i]) {
				max = nums[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		P81VarargsSample vt = new P81VarargsSample();
		System.out.println("(12, 42, 38, 150, 111)の最大値：" + vt.getMax(12, 42, 38, 150, 111));
	}

}
