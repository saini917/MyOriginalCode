package DemoExample;

public class ReverseString1 {

	static String s= "deepak saini";
	static String s1 = "";
	
	public static void main(String[] args) {
		
		for(int i = s.length()-1; i >= 0; i--)
		{
			s1 += s.charAt(i);
		}
		System.out.println(s1);
	}

}
