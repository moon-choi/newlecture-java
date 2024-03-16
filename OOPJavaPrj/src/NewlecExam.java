import part3.ex4.UI코드분리하기.Exam;

public class NewlecExam extends Exam {

	private int comp;
	
	public NewlecExam() {
		this(0, 0, 0, 0); //밑의 생성자 호출 (코드 중복 방지)  
	}
	
	public NewlecExam(int kor, int eng, int math, int comp) { //생성자 오버로드 
		super(kor, eng, math); //생성자 오버라이드 (부모객체의 부모기능으로 초기화) 
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
		return super.total() + comp;
	}
	
	@Override
	public float avg() {
		return total() / 4.0f;
	}


}
