package DemoExample;

import java.util.Scanner;

public class CountProgram {

	public static void main(String[] args) {
		
		int count=0;
		
		@SuppressWarnings("resource")
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Please Enter the String here");
		String str=scanner.next();
		
		System.out.println("Enter the letter to count");
		String str1=scanner.next();
		
		char cha=str1.charAt(0);
		
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)==cha)
			{
				count++;
			}
		}
		
		System.out.println(count);

	}

}
