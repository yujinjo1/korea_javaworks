package interfaces.bookshelf;

//Shelf를 상속하고 Queue를 구현한 BookShelf 클래스 정의
public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {

		shelf.add(title);
	}

	@Override
	public String deQueue() {
		//예외 처리 
//		if(shelf.isEmpty()) {
//			System.out.println("더 이상 꺼낼 책이 없습니다. ");
//			return null;
//		}
		int len = shelf.size();
		if(len==0) {
			System.out.println("더 이상 꺼낼 책이 없습니다.");
			 return null;
		}
		
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return shelf.size();
	}

}
