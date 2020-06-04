package DemoExample;

public class VowelConsonant {

	static String s = "i am deepak saini";
	
	static int count =0;
	public static void main(String[] args) 
	{
		char[] ch= s.toCharArray();
		
		StringBuffer strbuff = new StringBuffer();
		for(int i = 0; i < ch.length; i++){
			if((ch[i] != ' ') && (ch[i] != '\t')){
				strbuff.append(ch[i]);
			}
		}
		 String s2 = strbuff.toString();  
	      System.out.println(s2); 

		
		for(int index = 0; index<s2.length(); index++)
		{
			char s3 = s2.charAt(index);

			switch (s3) 
			{
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

