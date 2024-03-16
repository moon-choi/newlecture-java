public class Program {
						//main이 throws해버리면 더이상 받아줄 곳이 없음. 자바 런타임이 받음.
//	public static void main(String[] args) throws errorNegativeNumber, errorOverThousand {
		
	public static void main(String[] args) {
		int added;
		int subtracted;

		try {
//			added = Calculator.add(3,1000); //오류나면 이 이후로는 실행이 안됌. 
//			System.out.println(added);			
//			subtracted = Calculator.subtract(3,4);
//			System.out.println(subtracted);
			int divided = Calculator.divide(3,0);
			System.out.println(divided);
		} catch (errorOverThousand | errorNegativeNumber e) { //모아서 처리하거나 각각 처리할 수 있음.
			System.out.println("특화된 에러: " + e.getMessage()); //특화시킨 에러 
			  
		} catch (Exception e) {
			System.out.println("catch all에러: " + e); //범용 에러 
		} finally {
			System.out.println("연산이 끝났습니다.");
		}
		
		int multiplied = Calculator.multiply(3,4);
		System.out.println(multiplied);
 
	}

}