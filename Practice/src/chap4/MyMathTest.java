package chap4;

public class MyMathTest {

	public static void main(String[] args) {
		// MyMath 클래스의 객체 생성
		/*MyMath  math =new MyMath();
		int value1=math.abs(-4);
		System.out.println(value1);*/
		
		int value2= MyMath.abs(-8);
		System.out.println(value2);

		//자바에섯 제공하는  math클래스 사용
		int value3=Math.abs(-8);
		System.out.println(value3);
		
		int je= MyMath.square(5);
		System.out.println(je);
		
	}

}
