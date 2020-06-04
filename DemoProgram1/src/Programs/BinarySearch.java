package Programs;

public class BinarySearch{

	public static void main(String[] args) {

		int[] arr = {2,1,4,56,44,67,345,5677,9789,698899};
		System.out.println(bsearch(sort(arr),345));
	}

	public static int[] sort(int[] arr){
		int i, j, temp, length = arr.length;

		for(i = 0; i < length; i++){

			for(j = 0; j < length-i-1; j++){

				if(arr[j] > arr[j+1]){

					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;

	}


	public static int bsearch(int arr[], int element){
		int f = 0, l = arr.length-1, m = (f + l)/2;

		while(f <= l){

			if(arr[m] == element){
				return m;

			}else if(arr[m] < element){
				f = m + 1;
			}
			else if (arr[m] > element){
				l = m-1;
			}
			m = (f + l)/2;
		}
		if(f > l){
			System.out.println("element is not found in the array");
		}

		return -1;
	}

}
