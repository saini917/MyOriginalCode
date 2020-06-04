package DemoExample;

public class PrimeNumRange {

	static String prime = "";
	public static void main(String[] args) {

		for(int i = 100; i <= 200; i++)
		{
			int count = 0;
			for( int j = i; j >= 1; j--)
			{
				if( i % j == 0)
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


