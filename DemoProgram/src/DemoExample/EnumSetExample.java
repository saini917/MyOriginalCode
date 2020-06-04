package DemoExample;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY  
	}  
public class EnumSetExample {

	public static void main(String[] args) {
		//Set<days> set=EnumSet.of(days.SUNDAY, days.SATURDAY);
		Set<days> set=EnumSet.allOf(days.class);
		Iterator<days> it=set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		Set<days> set1 = EnumSet.noneOf(days.class);  
		Iterator<days> it1=set1.iterator();
		while(it1.hasNext()){
			System.out.println("Week Days:" +it1.next());
		}
	}

}
