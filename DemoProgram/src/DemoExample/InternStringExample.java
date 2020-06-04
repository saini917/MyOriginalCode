package DemoExample;

public class InternStringExample {
	public static void main(String[] args) {
		String s="Deepak";
		String s1=s.intern();
		String s2=new String("Deepak");
		String s3=s2.intern();
		
		System.out.println(s == s1);
		System.out.println(s == s2);
		System.out.println(s == s3);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
		
		
	}

}
