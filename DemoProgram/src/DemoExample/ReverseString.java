package DemoExample;

public class ReverseString {
	
	static String temp;
	static String name ="I love selenium";
	
	public static void main(String[] s)
	{
		String[] s1=name.split(" ");
		for(int i=0; i<=s1.length-1;i++)
		{
			temp=s1[i];
			for(int j=temp.length()-1;j>=0;j--)
			{
				System.out.println(temp.charAt(j));
			}
		}
	}

}
