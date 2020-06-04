package DemoExample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String> hashSet=new TreeSet<String>();
		hashSet.add("catty");
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

