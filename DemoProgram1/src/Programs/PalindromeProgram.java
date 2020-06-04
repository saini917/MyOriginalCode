package Programs;

public class PalindromeProgram 
{

	static String s = "madam";
	static String s1 = "";
	
	public static void main(String[] args) 
	{
		for(int i = s.length()-1; i>=0; i--)
			 s1 += s.charAt(i);
			if(s.equals(s1))
				System.out.println("palindrome");
			else
				System.out.println("not palindrome");
		}
	}

