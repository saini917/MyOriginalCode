package DemoExample;

public class ValidConstructorQuestion {
 int i;
	int ValidConstructorQuestion(int i)
	{
		this.i=i;
		return i;
	}
	
	ValidConstructorQuestion(int i)
	{
		this.i=i;
		System.out.println(i);
	}
	public static void main(String[] args) {

		ValidConstructorQuestion a=new ValidConstructorQuestion(5);
		ValidConstructorQuestion a1=new ValidConstructorQuestion(5);
		
	}

}
