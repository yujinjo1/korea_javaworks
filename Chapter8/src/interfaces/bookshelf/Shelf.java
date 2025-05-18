package interfaces.bookshelf;

import java.util.ArrayList;

//책 제목(String)을 저장할 선반 클래스 정의(ArrayList)

public class Shelf {
	protected ArrayList<String> shelf;// protected 상속받은 자식클래스에게만 공개(접근 가능)
	
	public Shelf() {
		shelf= new ArrayList<>();
		
		
	}
	public ArrayList<String> getShelf(){
		return shelf;
		
	}

}
