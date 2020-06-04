package DemoExample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> hashSet=new LinkedHashSet<String>();
		hashSet.add("deepak");
		hashSet.add("saini");
		hashSet.add("narendra");
		hashSet.add("kumar");
		hashSet.add("deepak");
		
		Iterator<String> itr=hashSet.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
