package DemoExample;

public class FabonicSeries {

	static int a=0, b=1,c;
	public static void main(String[] args) {
		for(int i=0;i<=6;i++)
		{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
	}

}
