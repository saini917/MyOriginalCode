package DemoExample;

public class Excep {

	public static void main(String[] args) {
		try{  
			try{  
				System.out.println("Start Program Running");  
				@SuppressWarnings("unused")
				int b =39/0;  
			}catch(ArithmeticException e){
				System.out.println("Throw Exception --->" +e );
			}  
			try{  
				int a[]=new int[5];  
				a[5]=4;  
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Throw Exception --->" +e );
				}  

			System.out.println("other statement");  
		}catch(Exception e){
			System.out.println("handeled");}  

		System.out.println("normal flow..");  
	}  
}
