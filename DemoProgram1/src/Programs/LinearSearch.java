package Programs;

public class LinearSearch {

	public static void main(String[] args) 
	{
		int arr[] = {3,6,2,67,12,56,78};
		System.out.println(search(arr,56));
	}
	
	public static int search(int arr[], int element)
	{
		int i, length = arr.length;
		for(i = 0; i < length; i++)
		{
			if(arr[i] == element)
			{
			 return i;	
			}
		}
		return -1;
		
	}

}
