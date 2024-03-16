package part3.ex6.인터페이스;

public class A {
	private X x;
	
	public A() {

	}

	public void setX(X x) { //new X가 안되므로. 
		this.x = x;
	}
	
	public void print() {
		int total = 0;
		if(x != null) {
			total = x.total();
		}
		System.out.printf("total is %d\n", total);
	}

}
