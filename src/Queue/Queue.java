package Queue;

import LinkedLists.Node;

public class Queue {
	
	Node front;
	Node rear;
	//List<Integer> linkedList = new LinkedList<Integer>();
	
	public void enqueue(int data) {
		Node toAdd = new Node();
		toAdd.setData(data);
		if(front==null) {
			front = rear = toAdd;
			return;
		}
		rear.setNext(toAdd);
		rear = rear.getNext();
	}
	
	public int dequeue() {
		Node temp = front;
		front = front.getNext();
		return temp.getData();
	}
	
	public void display() {
		Node node = front;
		
		while(node != rear.getNext() ) {
			System.out.println(node.getData());
			node = node.getNext();
		}
	}

}