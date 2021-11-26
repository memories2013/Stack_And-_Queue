package Stack;

import java.util.LinkedList;

public class Stacks {
	
	int top;
	
	LinkedList<Integer> list = new LinkedList<>();
	
	public void push(int data) {
		list.add(data);
	}
	
	public void show() {
		for(int i=(list.size()-1); i>=0; i--){
			System.out.println(list.get(i));
		}
	}
	
	
}