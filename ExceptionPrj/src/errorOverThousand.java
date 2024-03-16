public class errorOverThousand extends RuntimeException {
	public String getMessage() {
		return "입력값의 합이 1000을 넘는 오류가 발생하였습니다.";
	}
}
