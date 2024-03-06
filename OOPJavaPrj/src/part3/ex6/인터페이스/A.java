package part3.ex6.인터페이스;

public class A {
//	private B b;
	
	private X x;
	
	public void setX(X x) { //new X가 안되므로. 
		this.x = x;
	}

	//A와 B가 동시에 만들어져서 결합이 매우 강한 상태. 
	public A() {
//		b = new B();
	}
	
	public void print() {
//		int total = b.total();
		int total = 0;
		if(x != null) {
			total = x.total();
		}
		System.out.printf("total is %d\n", total);
	}

}
