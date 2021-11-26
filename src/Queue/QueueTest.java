package Queue;

public class QueueTest {
	
	public static void main(String[] args) {
		
		Queue newQueue = new Queue();
		newQueue.enqueue(56);
		newQueue.enqueue(30);
		newQueue.enqueue(70);
		
		newQueue.display();
	}
	
	
	
}