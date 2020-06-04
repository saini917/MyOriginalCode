package DemoExample;

public class CharAtExample {

	public static void main(String[] args) {

		String s="DeepakSaini";
		try{
			for(int i=0;i<s.length();i++){
				System.out.println(s.trim().charAt(i));
			}
		}
		catch (Exception e) {
		System.out.println(e);
		}

	}

}
