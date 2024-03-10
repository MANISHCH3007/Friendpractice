package oopsconceptsoverridinginheritance;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new  MethodOverloading();
		obj.sum();
		obj.sum(105);
		obj.sum(105, 20);
		

	}
	public void sum() {
		
		System.out.println("sum method");
		
	}
	public void sum(int i) {
		System.out.println("sum method 1");
		System.out.println(i);
		
	}
	public void sum (int i, int b) {
		
		System.out.println("sum method input 2");
		System.out.println(i+b);
		
		
	}
	
	
	

}
