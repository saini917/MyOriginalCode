package DemoExample;

public class LinearSearch {

	public static int search(int a[], int element) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == element) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		
		  int a[]={1,34,56,4,35,78,9}; 
		  System.out.println("index of element: "+search(a,35));
		 
	}

	}

	
