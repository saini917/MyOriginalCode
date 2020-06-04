package Programs;

public class PrimeNumberProgram 
{

	static int n = 17, a = 1;

	public static void main(String[] args) 
	{

		for(int i = 2; i < n; i++)
		{
			if(n % i == 0)
			{
				a = 0;
				break;
			}
		}
		if(a == 1)
		{
				System.out.println("number is prime");
			}
			else
			{
				System.out.println("number is not prime");
			}
		}

	}


