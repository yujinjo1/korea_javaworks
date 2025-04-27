package exceptions;

public class ExceptionHandling1 {
	
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: "+result);
	}

	public static void main(String[] args) {
		// 예외 발생 
		System.out.println("[프로그램 시작]\n");
		try {
		printLength("HEllo");
		printLength(null);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("[프로그램 종료]");

	}

}
