package Programs;

public class innovaccerStringProgram {

	static String s = "deepak1987male";

	public static void main(String[] args) {

		System.out.println("length of string:" + s.length());
		int l = s.length();
		int flag = 0;
		for (int i = 0; i <= l; i++) {

			char s1 = s.charAt(i);

			if (s1 >= 48 && s1 <= 57 && flag == 0) {
				System.out.println("name:" + s.substring(0, i));
				flag = i;
			} else {
				if (s1 > 57 && flag != 0) {
					System.out.println("Age:" + s.substring(flag, i));
					System.out.println("Gender:" + s.substring(i, l));
					break;
				}
			}

			/*
			 * String s1=s.substring(l-6,l-4); int age=Integer.parseInt(s1);
			 * System.out.println("Age:"+age);
			 * 
			 * String gender=s.substring(l-4,l);
			 * System.out.println("gender:"+gender);
			 * 
			 * String name=s.substring(l-12,l-6); 
			 * System.out.println("name:"+name); break;
			 */
		}

	}

}
