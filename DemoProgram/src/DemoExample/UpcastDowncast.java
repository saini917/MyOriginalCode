package DemoExample;

 class CC {
	
	public static void A()
	{
		System.out.println("A");
	}
}
	 class AAA extends CC
	 {
		 public static void A()
		 {
			 System.out.println("B");
		 }
	 }
	 
	 public class UpcastDowncast
	 {

	public static void main(String[] args) {
		
		//upcasting -- converting subclass data to superclass data
//		CC cc = (CC)new AAA();
//		cc.A();
		
		//Downcasting -- converting superclass data to subclass data
		CC cc = new AAA();
		AAA aa = (AAA) cc;
		aa.A();
	}

}
