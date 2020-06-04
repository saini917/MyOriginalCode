package DemoExample;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hashSet=new HashSet<String>();
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
