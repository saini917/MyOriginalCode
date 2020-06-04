package DemoExample;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample8 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		while(true){
			System.out.println("Please enter regex pattern :");
			Pattern pattern=Pattern.compile(sc.nextLine());
			
			System.out.println("Please enter text:");
			Matcher matcher=pattern.matcher(sc.nextLine());
			
			boolean found= false;
			
			while(matcher.find()){
				System.out.println("I found the text " +matcher.group() + " starting at index " +matcher.start() 
				+" and ending at index " +matcher.end() +" and Total number of matched subsequence: " +matcher.groupCount()
				+" and matched subsequence: " +matcher.group() +" and matched the pattern : " +matcher.matches());
				found=true;
			}
			if(!found){
				System.out.println("No match found");
			}
		}
		

	}

}
