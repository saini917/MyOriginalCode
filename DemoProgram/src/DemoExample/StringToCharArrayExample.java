package DemoExample;

public class StringToCharArrayExample {

	public static void main(String[] args) {
		String s="My name is deepak saini";
		int length=s.trim().length();
		System.out.println("length of String :" +length);
		
		System.out.println("String changed into Characters :");
		for(int i=0;i<length;i++){
			char[] ch=s.toCharArray();
			System.out.println(ch[i]);
		}

	}

}
