package Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s = "deepak saini";
		String s1 = "";
		
		for(int index = s.length()-1; index >= 0 ; index--)
		{
		   s1 += s.charAt(index);
		}
		System.out.println(s1);

	}

}
