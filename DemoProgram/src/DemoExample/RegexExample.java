package DemoExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		
		//Ist way
		//The . (dot) represents a single character.
		Pattern pattern=Pattern.compile(".s");
		Matcher macher=pattern.matcher("as");
		boolean b1=macher.matches();
		System.out.println(b1);
		
		//2nd way
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		//3rd way
		boolean b3=Pattern.matches(".s", "as");
		System.out.println(b3);
	}

}
