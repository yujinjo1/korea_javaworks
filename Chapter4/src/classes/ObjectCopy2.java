package classes;

//객체의 깊은 복사 Deep copy
public class ObjectCopy2 {

	public static void main(String[] args) {
		// Book 객체 생성
		//Book 객체 생성
				Book[] array1=new Book[3];
				Book[] array2=new Book[3];
				
				//array1에 객체 추가(매개변수 존재)
				////생성자
				//public Book(int bookNumber, String bookTitle, String author)
				//이 순서대로 값 지정해주자
				array1[0]=new Book(100,"채식주의자","한강");
				array1[1]=new Book(101,"자바 프로그래밍 입문","박은종");
				array1[2]=new Book(102,"모두의 파이썬","이승찬");
				
				//array2에 객체 생성 (기본 생성자)(매개변수 없음)
				array2[0]=new Book();
				array2[1]=new Book();
				array2[2]=new Book();
				
				//array1을 array2에 복사 (깊은 복사)
				for(int i=0; i<array1.length;i++) {
					array2[i].setBookNumber(array1[i].getBookNumber());
					array2[i].setBookTitle(array1[i].getBookTitle());
					array2[i].setAuthor(array1[i].getAuthor());
					
				}
				//array1의 ㅊ첫번째 요소 수정
				array1[0].setBookTitle("미생1");
				array1[0].setAuthor("윤태호");
				
				
				//향상된 for  문
				System.out.println("**********array1출력**********");
				for(Book book : array1)
					book.showBookInfo();
				
				//array1을 array2에 복사 
				for(int i=0; i<array1.length;i++) {
					array2[i]=array1[i];
				}
				
				System.out.println("**********array2출력**********");
				for(Book book : array2)
					book.showBookInfo();
				

	}

}
