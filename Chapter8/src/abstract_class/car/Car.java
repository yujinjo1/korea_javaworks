package abstract_class.car;

public abstract class Car {
	
	// 실체메서드
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	public void turnOff() {
			System.out.println("시동을 끕니다.");
		
	}
	//추상메서드
	//위에랑 다른 추상메소드-딱잘라 정하기 어렵다. 
	public abstract void drive();
	public abstract void stop();
	
	//템플릿 메서드 - 전체 기능의 흐름(프로세스)을 정의하는 메서드
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
		
	}
	
}
