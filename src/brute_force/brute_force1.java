package brute_force;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class brute_force1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세 카드의 값이 goal을 넘지 않으면서 최대인 값을 출력
		// https://www.acmicpc.net/problem/2798

		// 카드의갯수, 그 카드들의 합
		int card_count = randomRange(3, 10);
		int goal = randomRange(10, 300);

		Scanner sc = new Scanner(System.in);
		// 카드들이 저장되는 배열
		Integer card[] = new Integer[card_count];

		System.out.println("입력받을 카드의 갯수 : " + card_count);
		System.out.println("목표값 : " + goal);
		for (int i = 0; i < card_count; i++) {
			System.out.println(i + "번째 카드의 값");
			card[i] = sc.nextInt();
		}
		Arrays.sort(card, Collections.reverseOrder());

		int index = 0;

		// 가능한 최대의 수 card[index] 추출
		while (card[index] > goal - card[card.length - 1] - card[card.length - 2]) {
			index++;

			if (index == card.length - 1) {
				System.out.println("카드 세개를 합한 합의 모든 경우의 수가 지정된 수를 초과합니다");
				System.exit(0);
			}
		}

		int max = 0;
		// card[index]는 가능한 최대의 수, 즉 index보다 높은 인덱스를 가진 모든 경우의 수를 비교해봐야함.
		for (int i = index; i < card.length - 3; i++) {
			for (int j = i + 1; j < card.length - 2; j++) {
				for (int k = j + 1; k < card.length - 1; k++) {
					int sum = card[i] + card[j] + card[k];
					if (sum <= goal && sum > max) {
						max = sum;
					}
				}
			}
		}

		System.out.println("목표치에 가장 가까운 카드 세개를 합한 최대값 : " + max);

	}

	public static int randomRange(int n1, int n2) {
		return (int) (Math.random() * (n2 - n1 + 1)) + n1;
	}

}
