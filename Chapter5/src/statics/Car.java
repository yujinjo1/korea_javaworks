package statics;

public class Car {
	private static int serialNum =1000;
	//static이 붙은 변수는 값을 공유하게 만든다
	private int carNumber; //신차번호
	
	public Car() {
		serialNum++;
		carNumber =serialNum;
		
	}
	
	//번호 가져오기
	
	public int getCarNumber() {
		return carNumber;
	}
	

}


