package sort_algorithm;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		System.out.println(factorial(n));
	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		if (n == 1)
			return n;
		else
			return factorial(n-1 )*n;
	}

}
