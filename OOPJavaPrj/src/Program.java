import part3.ex4.UI코드분리하기.Exam;

public class Program {
	/*배포과정
	 1. 컴파일 -> Exam.class
	 2. 압축 -> Exam.zip
	 3. 자바 압축파일로 변환 -> Exam.jar 
	 */
	
	public static void main(String[] args) {
		Exam exam = new NewlecExam(10, 10, 10, 10);
//		exam.setKor(10);
//		exam.setEng(10);
//		exam.setMath(10);
//		exam.setComp(10);
		System.out.println(exam.total());

	}

}
