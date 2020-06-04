package DemoExample;

public class DuplicateElement {

	public static void main(String[] args) {
		String	dup[]={"java","dot net","javascript","java","C","C++","C","sql","sql"};
		for (int i = 0; i < dup.length; i++) { 
			for (int j = i + 1; j < dup.length; j++) { 
				if (dup[i].equals(dup[j])) {
					System.out.println("duplicate element -->" +dup[i]);
				}
			}
		}
		
	}
}



