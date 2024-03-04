package part3.ex3.Getters와Setters;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	public ExamList() {
		this(3); //size 안주어질 경우 기본 배열 길이는 3. 
	}
	
	public ExamList(int size) {
		exams = new Exam[size]; 
		current = 0;
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
		
		//set 하는 방법 1: 생성자 방식 
		Exam exam = new Exam(kor, eng, math);
		
		//set 하는 방법 2: setter 방식 
//		Exam exam = new Exam();
//		exam.setKor(kor);
//		exam.setEng(eng);
//		exam.setMath(math);
		
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
	
	public void printList() {
		this.printList(this.current);		
	}
	
	public void printList(int size) {
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 출력      │");
		System.out.println("└──────────────────┘");
		System.out.println();
		
		Exam[] exams = this.exams;
		
		for(int i = 0; i < size; i++) {
			Exam exam = exams[i];
			
			//Exam.java에서 kor의 변수명이 바뀌어도 이 파일에 영향 없음.
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
