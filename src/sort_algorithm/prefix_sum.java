package sort_algorithm;

public class prefix_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int data[] = { 10, 20, 30, 40, 50 };
		int summary = 0;
		
		int prefix_sum[] = new int[5];
		for (int i = 0; i < data.length; i++) {
			summary += data[i];
			prefix_sum[i] = summary;
		}
		
		//구간 합 계산
		int left = 3;
		int right = 4;
		System.out.println(prefix_sum[right] - prefix_sum[left-1]);
	}

}
