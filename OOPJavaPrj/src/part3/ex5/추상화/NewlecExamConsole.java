package part3.ex5.추상화;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	@Override
	protected void onInput(Exam exam) {
		//exam은 kor, eng, math밖에 없으므로 자식으로 형변환해야함.
		NewlecExam newlecExam = (NewlecExam)exam;  
		
		Scanner scan = new Scanner(System.in);
		int comp;
		
		do {
			System.out.printf("컴퓨터: ");
			comp = scan.nextInt();
			
			if(comp < 0 || 100 < comp)
			{
				System.out.println("컴퓨터 성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
		} while (comp < 0 || 100 < comp);
		
		newlecExam.setComp(comp);
		
	}

	@Override
	protected void onPrint(Exam exam) {
		//exam은 kor, eng, math밖에 없으므로 자식으로 형변환해야함.
		NewlecExam newlecExam = (NewlecExam)exam; 
		
		int comp = newlecExam.getComp();
		System.out.printf("컴퓨터 : %3d\n", comp);
	}

}
