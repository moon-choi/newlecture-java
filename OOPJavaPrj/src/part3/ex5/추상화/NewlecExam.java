package part3.ex5.추상화;

public class NewlecExam extends Exam {
	private int comp;

	public NewlecExam() {
		this(0, 0, 0, 0);
	}
	
	public NewlecExam(int kor, int eng, int math, int comp) {
		super(kor, eng, math);
		this.comp = comp;
	}
	
	public int getComp() {
		return comp;
	}

	public void setComp(int comp) {
		this.comp = comp;
	}
	
	@Override
	public int total() {
		int total = onTotal() + comp;
		return total;
	}

	@Override
	public float avg() {
		return total() / 4.0f;
	}
}
