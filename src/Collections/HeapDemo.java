package Collections;
import java.util.*;
public class HeapDemo {

	public static void main(String[] args) {
         
		Queue<Integer>  q = new PriorityQueue<>(Comparator.reverseOrder());
		q.add(7);
		q.add(2);
		q.add(10);
		q.add(71);
		q.add(5);
		// peek()-> it will be return the head of the queue and it will be return false whenever queue is empty
		//poll()->it will be return an element  , fetch and remove the head element in queue, it will be return null if the queue is empty
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q.poll());
		System.out.println(q.peek());
	}

}
