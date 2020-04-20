package solveJava;
import java.util.Scanner;

public class PaizaC01 {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int r = sc.nextInt();

    for (int i = 1; i <= n; i++) {
    	int h = sc.nextInt();
    	int w = sc.nextInt();
    	int d = sc.nextInt();
    	if(h >=(r * 2) && w >=(r * 2) && d >=(r * 2)) {
    		System.out.println(i);
    	}
    }
  }
}