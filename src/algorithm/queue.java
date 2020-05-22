package algorithm;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> queue = new LinkedList<>();
		
		queue.offer(5);
		queue.offer(4);
		queue.offer(3);
		queue.offer(2);
		queue.offer(1);
		
		System.out.println(queue);
		
		//가장먼저 넣었던 수를 조회하면서 뺀다
		System.out.println(queue.poll());
		queue.poll();
		System.out.println(queue);
		
		//peek는 큐나 스택의 구조를 건드리지않는다
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		
		System.out.println(queue.size());
	}

}
