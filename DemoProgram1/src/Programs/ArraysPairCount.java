package Programs;

public class ArraysPairCount {

	public static void main(String[] args) {

		int[] a = {13, -13, 1, 14, -1, -14, 3, 23, 24, 6, -6, 5, 5, 0, 0 };
		int sum = 0;
		getPairCount(a, sum);
	}
	
	public static void getPairCount(int a[], int sum){
		
		int count = 0, i, j;
		for(i = 0; i < a.length; i++){
			for(j = i + 1; j < a.length; j++){
				if( a[i] + a[j] == sum){
					count++;
				}
			}
		}
		System.out.println("count of pairs :" +count);
	}

}
