package chap5;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member[] members= new Member[3];
		
		members[0]=new Member("줭은하","하000");
		members[1]=new Member("줭은지","하000");
		members[2]=new Member("코","하000");
		
		System.out.println("************회원 현황************");
		for(int i=0; i<members.length; i++) 
			members[i].showMember();
		
		//향상된 for 문
		//for(자료형 변수: 배열이름){변수이름 출력}
		for(Member member: members)
			member.showMember();
	}
	

}
