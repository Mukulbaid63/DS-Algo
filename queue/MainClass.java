package queue;

public class MainClass {

	public static void main(String[] args) {

		MyQueue<Integer> mq = new MyQueue<>();
		
		mq.enqueue(12);//add the element to the end of queue
		mq.enqueue(2);
		mq.enqueue(123);
		mq.enqueue(45);
		
		
		System.out.println(mq.dequeue());//print the first element the queue and remove it from the queue
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		
		mq.enqueue(451);
		System.out.println(mq.dequeue());
		
		
	}

}
