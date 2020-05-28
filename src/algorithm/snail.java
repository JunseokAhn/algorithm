package algorithm;

public class snail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;// 달팽이의 차수

		int row, col;// 행 열
		int k = 0;// 달팽이 안쪽으로 들어갈 수록 감소되는 행,열 만큼 깍아줄 변수
		int snail[][] = new int[5][5];// 달팽이 배열
		int i = 1;// 달팽이 배열에 넣을 숫자
		for (n = 5; n > 0; n -= 2) {// 달팽에 차수에 따라 몇번 반복할지

			for (col = 0; col < n; col++) {
				snail[k][k + col] = i;
				i++;
			}

			for (row = 1; row < n; row++) {
				snail[k + row][5 - k - 1] = i;
				i++;
			}

			for (col = 1; col < n; col++) {
				snail[k + row - 1][5 - k - col - 1] = i;
				i++;
			}

			for (col = 1; col < n - 1; col++) {
				snail[5 - k - col - 1][k] = i;
				i++;
			}

			k++;

		}

		for (i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(snail[i][j] + " ");
			}
			System.out.println();
		}

	}

}
