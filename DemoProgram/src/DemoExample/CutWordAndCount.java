package DemoExample;

public class CutWordAndCount {

	static String s = "deepak I love java and mava and kava";
	static String s1= "";
	static int count = 0;
	
	public static void main(String[] args) {
		
		for(int i = 0; i<s.length(); i++)
		{
			if(s.charAt(i) != 'a')
			{
				s1+=s.charAt(i);
			}
			if(s.charAt(i) == 'a')
			{
				count++;
			}
		}
		System.out.println(s1);
		System.out.println("count of a = " +count);
	}

}
