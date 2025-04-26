package singleton.car;

public class Car {
	//static 변수 선언 (정적 변수)
	private static int serialNum=1000;//기준 번호, static이 없으면 숫자가 증가하지 않는다.  
	private int carNumber;//자동차 번호
	//생성자 
	public Car() {
		serialNum++;
		carNumber=serialNum; 
	}
	//접근자
	public int getCarNumber() {
		return carNumber;
	}

}
