package part3.ex3.Getters와Setters;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	
	//생성자: 초기화를 위한 특별한 함수. 반환하는 것이 없음. 
	public ExamList() {
		this(3);
		//중복 제거 
//		exams = new Exam[3]; 
//		current = 0;

	}
	
	//생성자 오버로드 
	public ExamList(int size) {
		exams = new Exam[size]; 
		current = 0;
	}
	
//	//인스턴스 메소드 (객체지향스럽게) 
//	public void init() {
//		this.exams = new Exam[3]; //this 생략 가능 
//		this.current = 0; //this 생략 가능
//	}
	
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
		
		//생성자 방식 
		Exam exam = new Exam(kor, eng, math);
		Exam exam2 = new Exam();
		
		//getter, setter 방
//		Exam exam = new Exam();
//		exam.setKor(kor);
//		exam.setEng(eng);
//		exam.setMath(math);
		
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
