package DemoExample;

public class binarySearch {
	
	public static int Bsearch(int a[], int element)
	{
		int f=0, l=a.length-1, m = (l + f)/2;
		while(f<=l)
		{
			if(a[m] == element)
			{
				return m;
			}
			else if(a[m] < element)
			{
				f = m + 1;
			}
			else if(a[m] > element)
			{
				l = m-1;
			}
			m = (l + f)/2;
		}
		if(f > l)
		{
			System.out.println("Element not found");
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int a[] = {10,20,40,42,56,67,89,100,400,600};
		System.out.println(Bsearch(a,89));

	}

}
