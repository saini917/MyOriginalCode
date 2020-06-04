package DemoExample;

public class thisClass {

	int i=10;
	
	public void b()
	{
		int i=20;
		i=this.i;
		System.out.println(i);
	}
	public static void main(String[] args) {
		thisClass a=new thisClass();
		a.b();

	}

}
