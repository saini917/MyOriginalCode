package Programs;

import java.util.ArrayList;

public class ArrayListSort 
{

	public static void main(String[] args) 
	{
		int i, j;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(2);
		arr.add(20);
		arr.add(1290);
		arr.add(12312);
		arr.add(123452);
		arr.add(120879);
		arr.add(0);
		
		int  size = arr.size(), temp;
		for(i = 0; i < size; i++)
		{
			for(j = 0; j < size-i-1; j++)
			{
				if(arr.get(j) > arr.get(j+1))
				{
					temp = arr.get(j);
					arr.set(j,arr.get(j+1));
					arr.set(j+1,temp);
				}
			}
		}

		System.out.println(arr);
	}

}
