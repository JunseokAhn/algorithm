package sort_algorithm;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < (array.length - 1) - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}

		}
		for (int i : array)
			System.out.println(i);
	}

}
