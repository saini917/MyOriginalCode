package DemoExample;

import java.util.Scanner;

public class ReverseRightTriangle {

	public static void main(String[] args) {
		int r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		r=sc.nextInt();
		
		for(int i = r; i>=1; i--)
		{
			for(int j = 1; j<=i; j++)
			{
			System.out.print("*");
			}
			System.out.println("");
		}

	}
}
