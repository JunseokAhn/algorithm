package algorithm;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class breadth_first_search {

	static int Ne;
	static int Nv;
	static int[][] ad;
	static boolean[] visit;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Ne = sc.nextInt();
		Nv = sc.nextInt();

		ad = new int[Nv + 1][Nv + 1];
		visit = new boolean[Nv + 1];

		for (int i = 0; i < Nv; i++) {
			int t1 = sc.nextInt();
			int t2 = sc.nextInt();

			ad[t1][t2] = ad[t2][t1] = 1;
		}

		BFS(1);
	}

	private static void BFS(int i) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList<>();
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();

		queue.offer(i);

		while (!queue.isEmpty()) {
			int temp = queue.poll();
			visit[temp] = true;
			System.out.println(temp);

			for (int j = 1; j <= Ne; j++) {
				if (ad[temp][j] == 1 && visit[j] == false) {
					if (!map.containsKey(j)) {
						queue.offer(j);
						map.put(j, true);
					}
				}
			}
		}
	}

}
