package DemoExample;

public class DuplicateDelete {

	static String s= new String("deepak");
	static String s1= new String();
	static boolean flag;

	public static void main(String[] args) {

		for (int index = 0; index < s.length(); index++) {
			flag=false;

			for(int j=0;j<s.length();j++){
				if (s.charAt(index) == s.charAt((j)) && index != j) {
					flag=true;
				}
			}
			if(!flag)
			{
				s1 += s.charAt(index);
			}

		}
		System.out.println(s1);
		
		System.out.println(removeDupsInPlace("deepak"));
	}
	
	
	public static String removeDupsInPlace(String s) {
	     StringBuilder output = new StringBuilder();
	 
	    for (int i = 0; i < s.length(); i++) {
	      String character = s.substring(i, i + 1);
	      if (output.indexOf(character) <0) // if not contained
	        output.append(character);
	    }
	    return output.toString();
	  }
	 
	}


