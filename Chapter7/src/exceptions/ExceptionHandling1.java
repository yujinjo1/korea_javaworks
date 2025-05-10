package exceptions;

public class ExceptionHandling1 {
	
	public static void printLength(String data) {
		int result = data.length();
		System.out.println("문자 수: "+result);
	}

	public static void main(String[] args) {
		// 예외 발생 
		System.out.println("[프로그램 시작]\n");
		try {//예외가 발생할 수 있느 곳을 try~catch로 감싼다.
		printLength("HEllo");
		printLength(null);
		}catch(NullPointerException e) {//예외 처리 메시지 입력하는 곳
			//NullPointerException대신 부모인 Exception사용 가능 
			System.out.println(e.getMessage());
		}
		System.out.println("[프로그램 종료]");

	}

}
