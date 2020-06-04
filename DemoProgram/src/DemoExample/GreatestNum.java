package DemoExample;

public class GreatestNum {
  static int a[] = {3,42,56,21,1,45,78,987,456,4};
  static int greater = a[0];
  static int smaller = a[0];
  
	public static void main(String[] args) {
		
		for(int i = 0; i < a.length; i++)
		{
			if(greater < a[i])
			{
			  greater = a[i];
			}
			
			else if (smaller > a[i])
			{
				smaller = a[i];
			}
		}
		
		System.out.println("greatest number = " +greater);
		System.out.println("smallest number = " +smaller);
	}

}
