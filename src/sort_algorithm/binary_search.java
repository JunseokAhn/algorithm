package sort_algorithm;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		binarySearch(2, arr);

	}

	public static void binarySearch(int i, int arr[]) {
		int mid;
		int left = 0;
		int right = arr.length - 1;

		while (right >= left) {
			mid = (right + left) / 2;

			if (i == arr[mid]) {
				System.out.println("index : " + mid);
				System.out.println("value : " + i);
				break;
			}

			if (i < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}

		}
	}

}
