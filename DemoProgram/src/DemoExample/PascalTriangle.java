package DemoExample;

import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		
		int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
		
		for(i=0;i<r;i++)
		{
			for(j=r; j>i; j--)
			{
				System.out.print(" ");
			}
            number = 1;
			for(k=0;k<=i;k++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - k) / (k + 1);
			}
			System.out.println();
		}
	}

}
