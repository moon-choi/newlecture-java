package part3.ex4.UI코드분리하기;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public ExamList() {
		this(3);
	}
	
	//Exam과는 Aggregation - Has a 관계. (집합)
	public ExamList(int size) {
		exams = new Exam[size]; 
		current = 0;
	}
	
	public Exam getExam(int i) {
		return this.exams[i];
	}

	public void addExam(Exam exam) {
		//변수 이름 단순화 
		Exam[] exams = this.exams;
		int size = this.current;
		
		if(exams.length == size) {
			Exam[] temp = new Exam[size + 3];
			for(int i = 0; i < size; i++) {
				temp[i] = exams[i];
			}
			this.exams = temp; 
		};
		
		this.exams[this.current] = exam;
		this.current++;
	}
	
	public int getSize() {
		return current;
	}

}
