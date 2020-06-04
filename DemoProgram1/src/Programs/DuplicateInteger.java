package Programs;

public class DuplicateInteger {

	public static void main(String[] args) {
		
		int i, j;
		int[] arr = {12, 3, 4, 3, 4, 5, 6, 12};
		System.out.println("Duplicate element:");
		
		for(i = 0; i < arr.length; i++){
			
			for(j = i + 1; j < arr.length; j++){
				
				if(arr[i] == (arr[j])){
					
					System.out.print(arr[j]);
				}
			}
			System.out.println();
		}

	}

}
