import java.util.*;

public class Queue {
	
	public static void main(String[] args){
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s", q);
		System.out.println();
		
		//displaying the highest priority
		System.out.printf("%s ", q.peek());
		System.out.println();
		
		q.poll();
		System.out.printf("%s ", q);
	}

}
