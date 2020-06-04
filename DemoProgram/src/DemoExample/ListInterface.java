package DemoExample;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInterface {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		list.add("Deepak");
		list.add("Saini");
		list.add("Virender");
		list.add("kumar");
		
		System.out.println("element at 2nd position: "+list.get(2));  
		ListIterator<String> itr=list.listIterator();  
		System.out.println("traversing elements in forward direction...");  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		System.out.println("traversing elements in backward direction...");  
		while(itr.hasPrevious()){  
		System.out.println(itr.previous());  
		}  
	}

}
