package algorithm;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stack = new Stack<>();

		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		System.out.println("스택 출력 : " + stack);

		System.out.print("스택 pop : ");
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());
		System.out.print(stack.pop());

		System.out.println();

		System.out.println("팝을 한 뒤, 스택 출력 : " + stack);
		System.out.println("팝을 한 뒤,  스택 사이즈출력 : " + stack.size());

		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);

		System.out.print("스택을 건드리지않고 최상단의 데이터를 조회 : ");
		System.out.print(stack.peek());
		System.out.print(stack.peek());
		System.out.print(stack.peek());
		System.out.print(stack.peek());
		System.out.print(stack.peek());

		System.out.println();
		System.out.println("peek뒤, 스택의 상태는 변화가없다 : " + stack.size());
	}

}
