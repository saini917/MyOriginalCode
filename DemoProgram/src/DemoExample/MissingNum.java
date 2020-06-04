package DemoExample;

import java.util.ArrayList;

public class MissingNum {

	static int a[] = {1,2,4,6,8,10,11,15,20};
	static int j= a[0];
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i = 0; i < a.length; i++)
		{
			 if(j == a[i])
			 {
				 j++;
				 continue;
			 }
			 else
			 {
				 arr.add(j);
				 j++;
				 i--;
			 }
		}
		
		for(int array : arr)
		{
			System.out.println(array);
		}
		

	}

}
