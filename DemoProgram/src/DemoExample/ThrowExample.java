package DemoExample;

public class ThrowExample {

	public static void main(String[] args) {
		validate(10);
	}

	static void  validate(int age){
		if(age<18)  
			throw new ArithmeticException("not valid");  
		else  
			System.out.println("welcome to vote");  
	}

}
