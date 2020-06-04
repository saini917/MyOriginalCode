package DemoExample;


public class ExceptionPropagation {

	public static void main(String[] args) {
		ExceptionPropagation obj=new ExceptionPropagation();  
		obj.p();  
		System.out.println("normal flow...");  
	}

	@SuppressWarnings("unused")
	void m(){  
		int data=50/0;  
		//throw new java.io.IOException("device error");//checked exception  cant be propagtion
	}  
	void n(){  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){
			System.out.println("exception handled");
		}  
	}  

}
