package Programs;

public class PrimeNumberRange 
{
	static int i, j, count;
	static String prime = "";

	public static void main(String[] args) 
	{
		for(i = 200; i <= 400; i++)
		{
			count = 0;
			for(j = i; j >= 1; j--)
			{
				if(i % j == 0)
				{
					count = count + 1;
				}
			}
			if(count == 2)
			{
				prime = prime + i + " ";
			}
		}
		System.out.println(prime);
	}

}
