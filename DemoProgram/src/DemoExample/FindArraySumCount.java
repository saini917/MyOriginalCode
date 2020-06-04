package DemoExample;

public class FindArraySumCount {

	public static void main(String[] args) {
		int arr[] = {1,-7,5,1,13,5};
		int sum = 6;
		getPairsCount(arr,sum);
	}
	
	public static void getPairsCount(int[] arr, int sum)
	{
		int count = 0, i, j;
		
		for(i = 0; i < arr.length; i++)
		{
			for(j = i+1; j < arr.length; j++)
			{
				if(arr[i] + arr[j] == sum)
				{
					count++;
				}
			}
		}
		System.out.printf("count :"+count);
	}

}
