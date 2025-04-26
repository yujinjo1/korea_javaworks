package polymorphism.downcasting;


class Animal{
	public void move() {
		System.out.println("동물1이 움직입니다.");
	}
}
class Human extends Animal{
	public void move() {
		System.out.println("사람이 움직입니다.");
	}
	public void readBook() {
		System.out.println("동물이 움직입니다.");
	}
	
}
public class AnimalTest {

	public static void main(String[] args) {
//		Human human = new Human();
//		human.move();
//		human.readBook();
		
//		Animal human = new Human();
//		human.move();
//		
		

		//readBook()에 접근 안됨- 다운 캐스팅(강제 타입 변환)필요함
		Animal animal = new Human();
		
		if(animal instanceof Human) { //animal이 Human.의 인스턴스라면
			Human human =(Human)animal;//Human으로 강제 타입 변환
			human.move();
			human.readBook();
			
		}
	}

}
