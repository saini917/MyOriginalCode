package DemoExample;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeques {

	public static void main(String[] args) {
		
		Deque<String> deque=new ArrayDeque<String>();
		deque.offer("Deepak");
		deque.offer("Saini");
		deque.add("virender");
		deque.offerFirst("kumar");
		deque.add("zira");
		
		System.out.println("After offerFirst Traversal...");  
		  for(String s:deque){  
		        System.out.println(s);  
		    }  
		  
		  deque.pollLast();  
		    System.out.println("After pollLast() Traversal...");  
		    for(String s:deque){  
		        System.out.println(s);  
		    }  
	}

}
