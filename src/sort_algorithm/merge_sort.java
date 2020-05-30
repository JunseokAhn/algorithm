package sort_algorithm;

public class merge_sort {

	static int arr[];
	static int temp[];

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arr = new int[] { 21, 10, 12, 20, 25, 13, 15, 22 };
		temp = new int[arr.length];
		mergeSort(0, arr.length - 2);

		for (int i : arr) {
			System.out.println(i);
		}
	}

	private static void mergeSort(int start, int end) {
		// TODO Auto-generated method stub

		if (start < end) {
			int mid = (start + end) / 2;
			mergeSort(start, mid);
			mergeSort(mid + 1, end);

			int s = start;
			int m = mid + 1;
			int index = s;

			while (s <= mid || m <= end) {
				if ((s <= mid && arr[s] < arr[m]) || m > end) {
					temp[index++] = arr[s++];
				} else {
					temp[index++] = arr[m++];
				}
			}

			for (int i = start; i <= end; i++) {
				arr[i] = temp[i];
			}
		}
	}

}