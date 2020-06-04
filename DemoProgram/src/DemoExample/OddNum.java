package DemoExample;

public class OddNum {

	public static void main(String[] args) 
	{
		String odd="";
		for(int i=100;i<=200;i++)
		{
			if(i%2!=0)
			{
				odd=odd+i+" ";
			}
		}
		System.out.println(odd);
	}
}
