package algorithm;

public class counting_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 5, 5, 3, 3, 3, 1, 1, 4, 1, 2, 1, 3, 4, 2, 2, 3 };

		int count[] = new int[5];

		// count 배열 0으로 초기화
		for (int i : count) {
			i = 0;
		}

		for (int i = 0; i < arr.length; i++) {
			count[arr[i] - 1]++;
		}

		int sum = 0;


		for (int i = 1; i <= count.length; i++) {
			for (int j = 0; j < count[i - 1]; j++) {
				arr[sum] = i;
				sum++;
			}
		}

		//각 숫자들의 범위의 합
		for (int i : count)
			System.out.print(i);
		System.out.println();

		//계수 정렬
		for (int i : arr)
			System.out.print(i);
	}

}
