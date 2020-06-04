package DemoExample;

public class EvenNum {

	static String even = "";
	
	public static void main(String[] args) {
		
		for(int i =100; i <= 200; i++)
		{
			if(i%2 == 0)
			{
				even=even + i +" ";
			}
		}
		System.out.println(even);
	}

}
