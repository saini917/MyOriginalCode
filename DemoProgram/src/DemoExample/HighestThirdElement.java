package DemoExample;

public class HighestThirdElement {

	public static void main(String [] args) {
		int arr[] = {10,9,8,6,7,5,4,1,2,0,3,-4,-6,-9};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		System.out.println("First largest number is:: "+arr[arr.length-1]);
		System.out.println("Second largest number is:: "+arr[arr.length-2]);
		System.out.println("Third largest number is:: "+arr[arr.length-3]);
		System.out.println("Fourth largest number is:: "+arr[arr.length-4]);
		System.out.println("Fifth largest number is:: "+arr[arr.length-5]);
		System.out.println("Sixth largest number is:: "+arr[arr.length-6]);
		System.out.println("Seventh largest number is:: "+arr[arr.length-7]);
		System.out.println("Eighth largest number is:: "+arr[arr.length-8]);
		System.out.println("Ninth largest number is:: "+arr[arr.length-9]);
		System.out.println("Tenth largest number is:: "+arr[arr.length-10]);
		System.out.println("Eleventh largest number is:: "+arr[arr.length-11]);
		System.out.println("Tewelth largest number is:: "+arr[arr.length-12]);
		System.out.println("Thirteen largest number is:: "+arr[arr.length-13]);
		System.out.println("Fourteen largest number is:: "+arr[arr.length-14]);
	}

}
