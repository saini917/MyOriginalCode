package Programs;

import java.util.Arrays;

public class ArraySort 
{

	public static void main(String[] args) 
	{
		int[] a={1,3,2,5,67,23,45,65,78,8068,34};
		System.out.println(Arrays.toString(sort(a)));

	}
	
	public static int[] sort(int[] a)
	{
		int i, j, temp, length=a.length;
		
		for(i = 0; i < length; i++)
		{
			for(j = 0; j < length-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					temp = a[j];
					 a[j] = a[j+1];
					 a[j+1] = temp;
 				}
			}
		}
		return a;
		
	}

}
