package sort_algorithm;

import java.util.Scanner;

public class pascal_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("三角形の高さを決めてください。: ");
		int takasa = sc.nextInt();
		int arr[][] = new int[takasa][takasa];

		for (int i = 0; i < takasa; i++) {

			arr[i][0] = 1;
			arr[i][i] = 1;
			for (int j = 0; j <= i; j++) {

				if (i != 0 && j != 0)
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				System.out.print(arr[i][j]);
			}

			System.out.println();
		}
	}

}
