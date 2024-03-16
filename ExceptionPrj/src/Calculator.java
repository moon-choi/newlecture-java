public class Calculator {
	public Calculator() {
	
	}
										//main으로 던짐. 
	public static int add(int x, int y)  {
		int result = x + y;
		
		if(result > 1000) {
			throw new errorOverThousand();
		}
		
		return result;		
	}

	public static int subtract(int x, int y)  {
		int result = x - y;
		
		if(result < 0) {
			throw new errorNegativeNumber();
		}
		
		return result;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static int divide(int x, int y) {
		return x / y;
	}
}
