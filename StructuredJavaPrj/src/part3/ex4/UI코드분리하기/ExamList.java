package part3.ex4.UI코드분리하기;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public Exam getExam(int i) {
		return this.exams[i];
	}

	public void addExam(Exam exam) {
		Exam[] exams = this.exams;
		int size = this.current;
		
		if(exams.length == size) {
			//1. 크기가 더 큰 새로운 배열 생성 
			Exam[] temp = new Exam[size + 1];
			//2. 값을 이주시키기 
			for(int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			//3. list.exams가 새로만든 temp 배열을 참조하도록 참조값 변경 
			this.exams = temp; 
			
		};
		
		this.exams[this.current] = exam;
		this.current++;
	}
	
	public ExamList() {
		this(3);
	}
	
	public ExamList(int size) {
		exams = new Exam[size]; 
		current = 0;
	}

	public int getSize() {
		return current;
	}

}
