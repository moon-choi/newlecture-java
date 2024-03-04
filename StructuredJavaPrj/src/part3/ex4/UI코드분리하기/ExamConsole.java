package part3.ex4.UI코드분리하기;

import java.util.Scanner;

public class ExamConsole {
	//Composition Has a 관계 (부모가 만들어질 때 자식도 같이 만들어짐)
	private ExamList list;
	
	public ExamConsole() {
		list = new ExamList();
	}
	
	public void inputList() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 입력      │");
		System.out.println("└──────────────────┘");
		System.out.println();
	
		int kor, eng, math;
		
		do {
			System.out.printf("국어: ");
			kor = scan.nextInt();
			
			if(kor < 0 || 100 < kor)
			{
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
		} while(kor < 0 || 100 < kor);
		
		
		do {
			System.out.printf("영어: ");
			eng = scan.nextInt();
			
			if(eng < 0 || 100 < eng)
			{
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
		} while(eng < 0 || 100 < eng);
		
		
		do {
			System.out.printf("수학: ");
			math = scan.nextInt();
			
			if(math < 0 || 100 < math)
			{
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
		} while(math < 0 || 100 < math);
		
		Exam exam = new Exam(kor, eng, math);
		
		/*-----ADD-----*/
		list.addExam(exam);
	}
	
	public void printList() {
		printList(list.getSize());		
	}
	
	public void printList(int size) {
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 출력      │");
		System.out.println("└──────────────────┘");
		System.out.println();
		
		for(int i = 0; i < size; i++) {
			Exam exam = list.getExam(i);
			
			int kor = exam.getKor();
			int eng = exam.getEng();
			int math = exam.getMath();		
			
			int total = exam.total();
			float avg = exam.avg();
			
			System.out.printf("국어 : %3d\n", kor);
			System.out.printf("영어 : %3d\n", eng);
			System.out.printf("수학 : %3d\n", math);
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("────────────────────────");
			
		}
	}

}
