package DemoExample;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceGenerics {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"deepak");
		map.put(102,"Saini");
		map.put(103,"Virender");
		map.put(104,"Kumar");
		map.put(null,"null");
		
		for(Map.Entry m: map.entrySet()){
			System.out.println("Keys :" +m.getKey() +" " + "Values :" + m.getValue());
		}
	}

}
