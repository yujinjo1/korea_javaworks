package exceptions;

public class ThrowsException {

	public static void main(String[] args) {
		//호출(사용)한 곳에서 예외 처리함
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("예외 처리: "+e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		//Class.forName("java.lang.Math");//얘먼저 치고 마우스 올려놔서 위에거 만들어주기 클래스 throws연결
		Class.forName("java.lang.Math2");//일부로 틀려주기
		
	}

}
