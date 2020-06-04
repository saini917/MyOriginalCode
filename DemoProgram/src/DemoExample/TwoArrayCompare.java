package DemoExample;



public class TwoArrayCompare {

	public static void main(String[] args) {
		int a[]={1,2,3};
		int b[]={1,2,4};

		for(int i=0; i<a.length;i++)
		{
			for(int j=0; j<=b.length-1; j++)
			{
				if(a[i] == a[j])
				{
					System.out.println("Compare value");
				}
				else
				{
					System.out.println("Not Compare value");
				}
			}
		}
	}
}


