package DemoExample;

public class StringValueOfExample {

	public static void main(String[] args) {
		boolean bol = true;
		byte b = 11;
		short sh = 12;
		int i = 20;
		long l = 30L;
		float f = 23.12f;
		double d=23.05d;
		char[] ch={'j','a','v','a'};
		StringValueOfExample obj=new StringValueOfExample();  
		
		String s=String.valueOf(bol);
		String s1=String.valueOf(b);
		String s2=String.valueOf(sh);
		String s3=String.valueOf(i);
		String s4=String.valueOf(l);
		String s5=String.valueOf(f);
		String s6=String.valueOf(d);
		String s7=String.valueOf(ch);
		String s8=String.valueOf(obj);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
		System.out.println(s7);
		System.out.println(s8);
		
	}

}
