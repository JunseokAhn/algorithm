package sort_algorithm;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 69, 10, 30, 2, 16, 8, 31, 22 };
		quickSort(arr, 0, arr.length - 1);

		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

	public static void quickSort(int arr[], int left, int right) {

		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1);
			quickSort(arr, pivotNewIndex + 1, right);
		}

	}

	public static int partition(int arr[], int left, int right) {

		int pivot = arr[(left + right) / 2];

		while (left < right) {
			while ((arr[left] < pivot) && (left < right))
				left++;
			while ((arr[right] > pivot) && (left < right))
				right--;

			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}

		return left;
	}
}
