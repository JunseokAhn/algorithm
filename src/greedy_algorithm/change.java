package greedy_algorithm;

import java.util.Scanner;

public class change {

	private static int change;
	private static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 上品の価格が380円で、1000円をもらった場合、お釣りの一番効率的に渡す方法を探す。
		// 払える硬貨の種類は500、100、50、10、１円の6の種類が存在する。

		int money = 1000;
		Scanner sc = new Scanner(System.in);
		System.out.print("上品の価格を1000円以下で入力してください : ");
		int price = sc.nextInt();
		while (price > 1000) {
			System.out.print("上品の価格をもう一度入力してください : ");
			price = sc.nextInt();
		}
		change = money - price;
		System.out.println("を釣り : " + change + "円");
		int coin[] = { 500, 100, 50, 10, 1 };
		for (int i : coin) {
			method(i);
			System.out.println(i + "円" + count + "個");
			if(change==0)
				break;
		}

	}

	private static void method(int i) {
		// TODO Auto-generated method stub
		if (i <= change) {
			count = change / i;
			change = change - count * i;
		}
	}

}
