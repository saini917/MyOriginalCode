package DemoExample;

public class Armstrong {
	static int num=153, sum=0,temp=num,remainder;
	public static void main(String[] args) {
		
		while(num>0)
		{
			remainder=num%10;
			sum= sum +(remainder*remainder*remainder);
			num=num/10;
		}
			
			if(temp == sum)
			{
				System.out.println("Armstrong number");
			}
			 
			else
			{
				System.out.println("It is not Armstrong number");
			}
		}
	}
