package Programs;

import java.util.HashMap;
import java.util.Map;

public class RepeatedWordCount 
{

	public static void main(String[] args) 
	{
		String str = "deepak saini 1234412";
		char[] arr = str.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (char value: arr) 
		{

			if (Character.isAlphabetic(value) || Character.isDigit(value)) 
			{
				if (charMap.containsKey(value)) 
				{
					charMap.put(value, charMap.get(value) + 1);

				}
				else 
				{
					charMap.put(value, 1);
				}
			}
		}

		System.out.println(charMap);
		
		
		//second way
		
//		String s="hsabcdefghbsah";
//		   int distinct = 0;
//		   for (int i = 0; i < s.length(); i++) {
//
//		       for (int j = 0; j < s.length(); j++) {
//
//		           if(s.charAt(i)==s.charAt(j))
//		           {
//		               distinct++;
//		           }
//		       }   
//		       System.out.println(s.charAt(i)+"--"+distinct);
//		       String d=String.valueOf(s.charAt(i));
//		       s=s.replaceAll(d,"");
//		       distinct = 0;
//		   }
	}

}
