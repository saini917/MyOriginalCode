package Programs;

public class Mixture {

	static String  s= "word1234drow#@#$$deepak";

	public static void main(String[] args) {

		for (int i = 0 ; i < s.length() ; i++){
			char ch = s.charAt(i);

			if (ch >= '0' && ch <= '9'){
				System.out.println("Number: " +ch);
			}
			else if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z'){
				System.out.println("Character: " +ch);
			}
			else{
				System.out.println("Symbol: "+ch);
			}
		}
	}

}
