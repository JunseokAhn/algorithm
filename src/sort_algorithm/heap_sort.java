package sort_algorithm;

public class heap_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 트리구조를 최대 힙구조로 변경
		int heap[] = { 7, 6, 5, 3, 8, 5, 9, 1, 6 };
		for (int i = 1; i < heap.length; i++) {
			int child = i;

			// 부모가 자식보다 작으면 위치를 바꿔준다. 바꾼 뒤, 그 바꾼 값을 다시 부모와 비교한다.
			while (child != 0) {
				// 부모index 구하는 식
				int parent = (child - 1) / 2;
				if (heap[parent] < heap[child]) {
					int temp = heap[child];
					heap[child] = heap[parent];
					heap[parent] = temp;
				}
				child = parent;
			}
		}

		System.out.print("heap arr : ");
		for (int i : heap)
			System.out.print(i);

		// 크기를 줄여가며 반복적으로 힙 구성
		for (int i = heap.length - 1; i > 0; i--) {
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i] = temp;
			int parent = 0;
			int child = 1;

			while (child < i) {
				child = 2 * parent + 1;
				// 자식중에 더 큰 값을 child로 지정
				if (child < heap.length - 1 && heap[child] < heap[child + 1])
					child++;

				// 부모보다 자식이 더 크면 위치변경, 바꾼 뒤, 그 바꾼 값을 다시 부모와 비교한다.
				if (child < i && heap[parent] < heap[child]) {
					temp = heap[child];
					heap[child] = heap[parent];
					heap[parent] = temp;
				}
				parent = child;
			}

		}

		// 계산되지 않은 마지막 비교식

		if (heap[0] > heap[1]) {
			int temp = heap[0];
			heap[0] = heap[1];
			heap[1] = temp;
		}

		System.out.println();
		for (int i : heap)
			System.out.print(i);
	}

}
