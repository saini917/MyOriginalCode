package DemoExample;

public class PerfectNumber {

	static int pnum=7, sum;
	public static void main(String[] args) {
		
		for(int i=1; i<=pnum/2; i++)
		{
			if(0 == pnum%i)
			{
				sum+= i;
			}
		}
		if(sum == pnum)
		{
			System.out.println("Perfect number");
		}
		else
		{
			System.out.println("Not Perfect number");
		}

	}

}
