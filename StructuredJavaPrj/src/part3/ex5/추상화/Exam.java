package part3.ex5.추상화;

public abstract class Exam {
	private int kor;
	private int eng;
	private int math;
	
	public Exam() {
		this(0, 0, 0);
	}
	
	public Exam(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public abstract int total(); //abstract는 틀을 만들고 자식클래스가 구현하도록 강요한다. 
	
	protected int onTotal() { //자식에게만 공개하는 메소드. 
		return kor + eng + math; 
	}
	
//	public int total() {
//		return kor + eng + math;
//	}

//	public float avg() {
//		return total() / 3.0f;
//	}
	public abstract float avg();
	
}

/*
추상메소드: 
공통 자료형(추상클래스)가 갖고 있는 공통 서비스 함수.
구현이 공통은 아니고, 서비스 틀 자체만 공통. 

추상메소드를 만드는 것:
공통화 작업. 
*/