package DemoExample;

public class SwappingWithoutThirdVariable {

	static int a = 13;;
	static int b = 30;
	public static void main(String[] args) {
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("value of a:" +a);
		System.out.println("value of b:" +b);

	}

}
