package Programs;

public class GreatestSmallestNumber 
{

	static int [] arr ={12,34,45,21,56,43,90,300,2000,5000,1000,0};
	static int greater = arr[0];
	static int smaller = arr[0];

	public static void main(String[] args) 
	{
		for(int i = 1; i < arr.length; i++)
		{
			if(greater < arr[i])
			{
				greater = arr[i];
			}
			else if (smaller > arr[i])
			{
				 smaller = arr[i];
			}
		}
		System.out.println("greater number: "+greater);
		System.out.println("smaller number: "+smaller);
	}

}
