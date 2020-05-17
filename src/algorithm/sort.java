package algorithm;

import java.util.Arrays;
import java.util.Collections;

public class sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 9, 7, 6, 2, 5, 8, 10, 1, 3, 4 };
		Arrays.sort(arr);
		for (int i : arr)
			System.out.print(i);

		// 2번째 인덱스부터 sort
		System.out.println();
		int arr2[] = { 9, 7, 6, 2, 5, 8, 10, 1, 3, 4 };
		Arrays.sort(arr2, 2, arr2.length);
		for (int i : arr2)
			System.out.print(i);

		// 역정렬, Integer로 선언해야함
		System.out.println();
		Integer arr3[] = { 9, 7, 6, 2, 5, 8, 10, 1, 3, 4 };
		Arrays.sort(arr3, Collections.reverseOrder());
		for (int i : arr3)
			System.out.print(i);

		//문자도 정렬가능
		System.out.println();
		String arr4[] = { "d", "e", "b", "t", "z", "a", "c", "h" };
		Arrays.sort(arr4);
		for (String i : arr4)
			System.out.print(i);
	}

}
