package Stack;

import java.util.LinkedList;

public class Stacks {
	
	int top;
	public Stacks() {
		this.top = -1;
	}

	LinkedList<Integer> list = new LinkedList<>();
	
	
	public void push(int data) {
		top++;
		list.add(data);
	}
	
	
	// popping and peeking till the stack becomes empty
	public void pop() {
		if(list.isEmpty()) {
			System.out.println("The Stack is empty");
		}
		else {
			peek();
			list.remove(top);
			top--;
			pop();
		}
	}
	
	
	public void peek() {
		System.out.println("Pop and Peek " +list.get(top));
	}
	
	
	public void show() {
		for(int i=(list.size()-1); i>=0; i--){
			System.out.println(list.get(i));
		}
	}
	
	
}