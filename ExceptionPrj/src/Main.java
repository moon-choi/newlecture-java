public class Main {
					
	public static void main(String[] args) {
		int added;
		int subtracted;

		try {
			added = Calculator.add(3,1000); 
			System.out.println(added);			
		} catch (errorOverThousand e) {
		 System.out.println("특화된 에러: " + e.getMessage()); 
			 
		}
		
		try {			
			subtracted = Calculator.subtract(3,4);
			System.out.println(subtracted);
		} catch (errorNegativeNumber e) {
		 System.out.println("특화된 에러: " + e.getMessage()); 
			 
		} finally {
			System.out.println("연산이 끝났습니다.");
		}
	}

}