package com.coachingProgram;


//ASCII code for letter: 65 to 90(uppercase) and 97 to 122(lowercaae)
// ASCII code for number: 48 t0 57
//ASCII code for special character: 32 to 46
public class MixNumberLetter {

	static String s = "zwa123absr@$%%%%^";
	static String l = "";
	static String num = "";
	static int d;
	static String symbol = "";

	public static void main(String[] args) {
		//mix();
		mixture();
	}

	// one way
	public static void mix() {

		for (int i = 0; i < s.length(); i++) {
			char[] ch = s.toCharArray();
			if (Character.isLetter(ch[i])) {
				l += ch[i];
			} else if (Character.isDigit(ch[i])) {
				num += ch[i];
				d = Integer.parseInt(num);
			} else if ((ch[i] >= 32) && (ch[i] <= 46) || (ch[i] == 64)) {

				symbol += ch[i];
			}
		}

		System.out.println(l + "," + d + "," + symbol);

	}

	// 2nd way
	public static void mixture() {

		for (int i = 0; i < s.length(); i++) {
			char[] ch = s.toCharArray();
			if ((ch[i]>= 65) && (ch[i]<= 90) || (ch[i]>= 97) && (ch[i]<= 122)) {
				l += ch[i];
			} else if ((ch[i]>= 48) && (ch[i]<= 57)) {
				num += ch[i];
				//d = Integer.parseInt(num);
			} else if ((ch[i] >= 32) && (ch[i] <= 46) || (ch[i] == 64)) {

				symbol += ch[i];
			}
		}

		System.out.println(l + "," + num + "," + symbol);

	}

}
