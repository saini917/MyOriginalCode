package Programs;

public class VowelConsonantCount {

	public static void main(String[] args) {

		String s = "I am working with IL&FS technologies";
		int count = 0;
		char[] ch= s.toCharArray();
		StringBuffer buffer = new StringBuffer();

		for(int index = 0; index < ch.length; index++){
			if((ch[index] != ' ') && (ch[index] != '\t')){

				buffer.append(ch[index]);
			}
		}

		String s1 = buffer.toString().toLowerCase();
		System.out.println(s1);

		for(int i = 0; i < s1.length(); i++){

		char s2 = s1.charAt(i);

			switch (s2) {

			case 'a':
				System.out.println("a is vowel");
				count++;
				break;

			case 'e':
				System.out.println("e is vowel");
				count++;
				break;

			case 'i':
				System.out.println("i is vowel");
				count++;
				break;

			case 'o':
				System.out.println("o is vowel");
				count++;
				break;

			case 'u':
				System.out.println("u is vowel");
				count++;
				break;

			default:
				System.out.println("next character is consonant");
				break;
			}
		}

		System.out.println("Total vowel count :" +count);

	}

}
