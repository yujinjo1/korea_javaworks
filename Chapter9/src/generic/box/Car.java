package generic.box;

public class Car {
	//default 멤버변수
	//같은 패키지에서 접근하고,
	//다른 패키지에서 접근할 수 없음
	//pubilc 이면 가능함. 
	String name;//모델명
	
	public Car(String name){
		this.name=name;
		
	}
	//이름이 안나오고 객체 코드가 나옴!!
//문자열로 바꿔주는 toString이 필요!!!!
//우클릭해서 source에서 tostring불러오기
	//객체의 문자열 정보 반환
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
