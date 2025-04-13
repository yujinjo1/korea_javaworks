package statics;

public class HelloTest {

	public static void main(String[] args) {
		// 인스턴스형 (new해서 객체 생성)
		Hello greeting = new Hello();
		
		greeting.sayHello();
		
		//static형 메서드는 클래스 이름으로 직접 접근(new하지 않음)
		Hello.sayGoodBye();
		

	}

}
