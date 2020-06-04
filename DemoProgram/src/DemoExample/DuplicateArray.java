package DemoExample;

import java.util.Arrays;

public class DuplicateArray 
{

	static int arr[] = new int[]{1,2,3,4,5,1,2,34,5,4,3};
	static int arr1[] = null;
	static int size = 1;
	static int count = 0;

	public static void main(String[] args) 
	{
		for(int i = 0; i< arr.length; i++)
		{
			for(int j = i + 1; j< arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					if(!checkDuplicate(arr1, arr[i]))
					{
						arr1=createDynamicSize(arr1,size);
						System.out.println("Duplicate Elements: " +arr[i]);
						arr1[count]= arr[i];
						count = count + 1;
						break;
					}
				}
			}

		}

		for(int k = 0; k< arr1.length; k++)
		{
			System.out.println("New Array: " +arr1[k]);
		}
	}

	public static boolean checkDuplicate(int arr[], int element)
	{
		if(arr != null)
		{
			for(int i = 0; i< arr.length; i++)
			{
				if(arr[i] == element)
				{
					return true;
				}
			}
		}
		return false;
	}

	public static int[] createDynamicSize(int arr[], int size1)
	{
		if(arr == null)
		{
			arr = new int[1];
		}
		else if(size == arr.length)
		{
			size = size1 + 1;
			arr = Arrays.copyOf(arr,size);
		}
		return arr;

	}

}
