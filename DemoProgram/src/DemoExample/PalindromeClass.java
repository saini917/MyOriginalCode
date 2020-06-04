package DemoExample;

public class PalindromeClass {

	static String p = "madam";
	static String p1 = "";

	public static void main(String[] args) {

		for(int i=p.length()-1; i>=0; i--)
			p1 = p1 +  p.charAt(i);

		if(p.equals(p1))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");

	}

}
