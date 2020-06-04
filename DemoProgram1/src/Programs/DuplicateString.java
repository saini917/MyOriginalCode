package Programs;

public class DuplicateString {

	public static void main(String[] args) {
	
		int i, j;
		String[] arr = {"jave", "Oracle", "Python", "SQL", "Jython", "Python", "Oracle"};
		System.out.println("Duplicate element:");
		
		for(i = 0; i < arr.length; i++){
			
			for(j = i + 1; j < arr.length; j++){
				
				if(arr[i].equals(arr[j])){
					
					System.out.print(arr[j].trim());
				}
			}
			System.out.println();
		}

	}

}
