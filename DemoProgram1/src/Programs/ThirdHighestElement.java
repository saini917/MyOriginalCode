package Programs;

public class ThirdHighestElement {

	public static void main(String[] args) 
	{
		int[] arr ={2,4,5,67,445,3,78,56,-3,-9,-8};
		int i, j, temp, length = arr.length;
		
		for(i = 0; i < length; i++)
		{
			for(j = 0; j < length-i-1; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		System.out.println(arr[arr.length-2]);

	}

}
