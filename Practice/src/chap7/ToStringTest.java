package chap7;

class MyDog{
	String name;
	String type;
	
	public MyDog(String name, String type) {
		this.name=name;
		this.type=type;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return type + " "+ name;
	}
	
	
	
	
}
public class ToStringTest {

	public static void main(String[] args) {
		MyDog dog = new MyDog("백구","진돗개");
		System.out.println(dog);

	}

}
