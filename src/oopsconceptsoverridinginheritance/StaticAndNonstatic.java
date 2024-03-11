package oopsconceptsoverridinginheritance;

public class StaticAndNonstatic {
       String name = "Arivd";// non static var.
		 static int age =26; // static var.
	public static void main(String[] args) {
     //1. direct call
		//2. callig by classname
		name();
		StaticAndNonstatic.name();
		
		StaticAndNonstatic obj= new StaticAndNonstatic();
		obj.age();
	
	}
	public void age() {  // non static method
		System.out.println("arvind age is 26yr");
	}
	public static void name() {
		System.out.println("Arvind is Bad guy");
		
		
	}

}
