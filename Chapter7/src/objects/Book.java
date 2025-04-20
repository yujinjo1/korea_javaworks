package objects;

public class Book {
	int bookNumber; //책 번호
	String bookTitle;// 책 제목
	
	Book(int bookNumber, String bookTitle){
		
		this.bookNumber=bookNumber;
		this.bookTitle= bookTitle;
		
	}

	@Override //출력 메세지 안만들고 출력하고 싶으면 재정의
	public String toString() {// 객체의 정보를 문자열로 출력
		
		return bookNumber+","+bookTitle;
		
	}

	@Override
	public boolean equals(Object obj) {//객체도 매개변수가 될수 있다.. 다형성이 들어가 
		//instanceof - 클래스의 객체(인스턴스)인지 확인 사용
		if(obj instanceof Book) {
			Book book = (Book)obj; //강제 타입 변환
			if(this.bookNumber ==book.bookNumber)
				return true;
			
		}
	
		return false;
	}
	
	
	

}
