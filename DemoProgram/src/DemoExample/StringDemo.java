package DemoExample;

public class StringDemo {

	public static void main(String[] args) {
		
		String str="payments $100 paid";
		int p=str.indexOf("$");
		System.out.println(p);
		char e=str.charAt(p);
		System.out.println(e);
	}

}
