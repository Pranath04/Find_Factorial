package find_factorial;

import java.util.Scanner;

public class Factorial{
	public static int fact(int A) {
		if(A==0) {
			return 1;
		}
		return fact(A-1)*A;
	}
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		scanner.close();
		System.out.println(fact(A));
	}
}