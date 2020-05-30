package sort_algorithm;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		for (int i = 0; i < array.length - 1; i++) {
			int j = i;

			while (array[j] > array[j + 1]) {
				int temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
				j--;
			}

		}

		for (int i : array)
			System.out.println(i);
	}

}
