package DemoExample;

public class StringConcatExample {
	public static void main(String[] args) {
		String s1="deepak";
		String s2="saini";
		String s3="deepak";
		String s4=new String("deepak");
		
		
		System.out.println("----------Using + operator ---------");
		System.out.println(s1 + s2);
		System.out.println(s1 + s3);
		System.out.println(s2 + s3);
		System.out.println(s1 + s4);
		System.out.println(40 + 50 + s1 + s2 + 40 + 50);
		System.out.println(40 + 50 + s1 + 40 + 50 + s2 + 40 + 50);
		
		
		System.out.println("----------Using concat method ---------");
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s3));
		System.out.println(s3.concat(s2));
		System.out.println(s1.concat(s4));
		System.out.println(50 + 40 + s1 + 40 + 50 + s1.concat(s2));
	}

}
