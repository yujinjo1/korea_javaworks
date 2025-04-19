package chap5;

public class Member {
	//객체 배열 만들기 5장 29페이지
	private String id;
	private String pw;
	//생성자
	public Member(String id, String pw) {
		this.id=id;
		this.pw=pw;
	}
	
	//정보 출력 메서드  
	public void showMember() {
		System.out.println("id="+id+","+"password="+pw);
		
	}

}
