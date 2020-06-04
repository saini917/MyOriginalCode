package Programs;

public class FactorialProgram 
{
	static int f = 1;

	public static void main(String[] args) 
	{
		for(int i = 1; i <= 3; i++)
		{
			f =  f * i;
		}
		System.out.println(f);

	}

}
