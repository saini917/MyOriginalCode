package DemoExample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterfaceNonGenerics {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101,"deepak");
		map.put(102,"Saini");
		map.put(103,"Virender");
		map.put(104,"Kumar");
		
		@SuppressWarnings("rawtypes")
		Set set=map.entrySet();
		@SuppressWarnings("rawtypes")
		Iterator it=set.iterator();
		 while(it.hasNext()){
			 @SuppressWarnings("rawtypes")
			Map.Entry m=(Map.Entry)it.next();
			System.out.println("Keys :" +m.getKey() +" " + "Values :" + m.getValue());
		}
	}

}
