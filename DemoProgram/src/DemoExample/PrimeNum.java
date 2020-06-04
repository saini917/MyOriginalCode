package DemoExample;

public class PrimeNum {

	static int num = 113;
	static int a=1;
	public static void main(String[] args) {
		for(int i=2; i<num; i++)
		{
			if(0 == num%i)
			{
				a=0;
				break;
			}
		}
		
		if(a==1)
		{
			System.out.println("Number is prime");
		}
		else
		{
			System.out.println("Number is not prime");
		}

	}

}
