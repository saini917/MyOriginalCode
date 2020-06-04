package Programs;

public class ArmstrongProgram 
{

	static int num = 153, remainder, sum = 0, temp = num;
	
	public static void main(String[] args) 
	{

		while(num>0)
		{
			remainder = num%10;
			sum = sum + (remainder * remainder * remainder);
			num = num/10;
		}
		if(sum == temp)
		{
			System.out.println("number is Armstrong");
		}
		else 
		{
			System.out.println("number is not Armstrong");
		}
	}

}
