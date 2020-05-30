package sort_algorithm;

public class selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = { 1, 10, 5, 8, 7, 6, 4, 3, 2, 9 };
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			//i for문이 돌때마다 min을 초기화시켜줘야하는것이 포인트
			int min = 9999;
			
			for (int j = i; j < array.length; j++) {
				if (min > array[j]) {
					min = array[j];
					index = j;
				}
			}
			
			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}

		for (int i : array)
			System.out.println(i);
	}

}
