package DemoExample;


public class SearchStringAsValue {

	public static void main(String[] args) {
		String stringArrayList[]={"ITL","ENVIRONMENT","LEGACY","FINANCE","INSURANCE","LEGACY","ITL","ITL","ITL","ENVIRONMENT"};
		String stringToSearch="ITL";
		boolean found=false;
		int count=0;
		
		//Another way 
//		ArrayList<String> listArray=new ArrayList<String>(Arrays.asList(stringArrayList));
//		System.out.println("count of String :-"+stringToSearch+" is:-"+listArray.stream().filter(s-> {if(s.equals(stringToSearch)) return true; return false;}).count());
		
		for(String searchElement:stringArrayList){
			if(searchElement.equals(stringToSearch))
			{
				count++;
				found=true;
			}
		}

		if(found){
			System.out.println("The array contains the string :" +stringToSearch);
			System.out.println("Total count :" +count);
		}
		else {
			System.out.println("The array does not contains the string :" +stringToSearch);
		}

	}

}
