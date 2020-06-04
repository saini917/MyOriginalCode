package DemoExample;

import java.util.ArrayList;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(12);
		arr.add(34);
		arr.add(4);
		arr.add(1);
		arr.add(23);
		arr.add(15);
		arr.add(10);
		
		for(int i=0; i<arr.size(); i++)
		{
			for(int j=0; j<arr.size()-i-1; j++)
			{
				if(arr.get(j) > arr.get(j+1))
				{
					int temp = arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1,temp);
				}
			}
		}
		System.out.println(arr);
	}

}
