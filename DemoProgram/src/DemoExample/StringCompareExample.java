package DemoExample;

public class StringCompareExample {
	public static void main(String[] args) {
		String s1="deepak";
		String s2="saini";
		String s3="deepak";
		String s4=new String("deepak");
		
		System.out.println("----------Using equals method ---------");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println("----------Using == operator ---------");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		
		System.out.println("----------Using compareTo ---------");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s1));
			
		}
	}


