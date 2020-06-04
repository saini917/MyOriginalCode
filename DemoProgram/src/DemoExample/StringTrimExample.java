package DemoExample;

public class StringTrimExample {

	public static void main(String[] args) {
		String s=" my name is deepak saini  ";
		int length=s.length();
		System.out.println("Length of String without Trim :" +length);
		System.out.println("String without Trim :" +s);
		
		String s1=s.trim();
		int len=s1.length();
		System.out.println("Length of String with Trim :" +len);
		System.out.println("String without Trim :" +s1);
	}

}
