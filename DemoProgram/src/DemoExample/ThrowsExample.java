package DemoExample;

import java.io.IOException;

public class ThrowsExample {

	public static void main(String[] args) {
		ExceptionPropagation obj=new ExceptionPropagation();  
		obj.p();  
		System.out.println("normal flow...");  
	}

	void m() throws IOException{  
		throw new java.io.IOException("device error");//checked exception  can be propagtion
	}  
	void n() throws IOException{  
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


