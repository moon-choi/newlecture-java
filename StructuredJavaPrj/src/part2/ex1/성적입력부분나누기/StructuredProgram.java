package part2.ex1.성적입력부분나누기;

import java.util.Scanner;

public class StructuredProgram {

	public static void main(String[] args) {
		int[] scores = new int[3];
		int menu;
		boolean keepLoop = true;
		
		while(keepLoop)	{
			menu = inputMenu();
			
			switch(menu)
			{
			case 1:
				inputScore(scores);
				break;
			case 2:
				printScore(scores);
				
				break;
			case 3:
				System.out.println("Bye~~");
				
				keepLoop = false;
				break;
				
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}

	} //main 끝 
	
	
	static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("┌──────────────────┐");
		System.out.println("│     메인 메뉴      │");
		System.out.println("└──────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		int menu = scan.nextInt();
		
		return menu;
	}
	
	static void inputScore(int[] kors) {
		Scanner scan = new Scanner(System.in);
		int score;
		
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 입력      │");
		System.out.println("└──────────────────┘");
		System.out.println();
		
		for(int i = 0; i < 3; i++) {
			do {
				System.out.printf("국어%d : ", i+1);
				score = scan.nextInt();
				
				if(score < 0 || 100 < score)
				{
					System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
				}
			} while(score < 0 || 100 < score);
			
			kors[i] = score;
		}
		
		System.out.println("────────────────────────");
	}
	
	static void printScore(int[] kors) {
		int total = 0;
		float avg = 0;
		
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 출력      │");
		System.out.println("└──────────────────┘");
		System.out.println();
		
		for(int i = 0; i < 3; i++)
		{
			System.out.printf("국어 %d : %3d\n", i + 1, kors[i]);
		}
		System.out.printf("총점 : %3d\n", total);
		System.out.printf("평균 : %6.2f\n", avg);
		System.out.println("────────────────────────");
	}

}