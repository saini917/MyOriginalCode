package DemoExample;

import java.util.Arrays;

public class ArraySort {

	public static int[] sort(int a[])
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length-i-1; j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		return a;

	}

	public static void main(String[] args) {
		int a[]= {2,4,3,6,9,34,46,23};
		System.out.println("List of sorting array:" + Arrays.toString(sort(a)));
		System.out.println("List of sorting array:" + +a[a.length-3]);

	}

}
