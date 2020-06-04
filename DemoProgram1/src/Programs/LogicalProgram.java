package Programs;

public class LogicalProgram {

	public static void main(String[] args) {

		int d = add(10,20);
		System.out.println(d);
		
		adds(10,30);
	}
	
	public static int add(int a,int b){
		int c = a+b;
		return c;
	}
	
	public static void adds(int a, int b){
		int c = a +b;
		System.out.println(c);
	}

}
