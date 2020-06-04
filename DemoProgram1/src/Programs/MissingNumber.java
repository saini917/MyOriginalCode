package Programs;

import java.util.ArrayList;

public class MissingNumber {

	static int[] arr = {1,2,4,7,9,11,20};
	static int j = arr[0];
	
	public static void main(String[] args) {
		
		System.out.println("Missing number:");
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		
		for(int i = 0; i < arr.length; i++){
			
			if(j == arr[i]){
				
				j++;
				continue;
			}else
			{
				arraylist.add(j);
				j++;
				i--;
			}
		}
		for(int array : arraylist){
		System.out.println(array);
		}

	}

}
