package DemoExample;

import java.util.regex.Pattern;

public class RegexExample1 {
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches(".s", "as"));
		System.out.println(Pattern.matches("..s", "mas"));
		System.out.println(Pattern.matches("...s", "maas"));
		System.out.println(Pattern.matches("...s", "asss"));
		System.out.println(Pattern.matches(".s", "akst"));//false because t after s character 
		System.out.println(Pattern.matches(".s", "ask"));//false because k after s character 
	}
}
