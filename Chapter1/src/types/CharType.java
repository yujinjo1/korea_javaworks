package types;

public class CharType {

	public static void main(String[] args) {
		// 문자 및 문자열 자료형
		System.out.println("****문자자료형****");
		
		//char(2byte)-16비트: -32000~32000
		char ch1 = 'B';
		
		//System.out.println(ch1);
		System.out.println((int)ch1);//아스키 코드값(int)-명시적 형변환
		
		char ch2 = 66;
		//int ch2 = 67;
		System.out.println(ch2);
		
		char kor1='가';
		System.out.println(kor1);
		
		//char(2byte)-16bit :2의 16승 -65000개
		//char kor2 ='\uAC00';//유니코드
		String kor2 = "\u1F600";//이모지 출력하는 유니코드는 string사용!
		System.out.println(kor2);
		
		System.out.println("****문자열 자료형****");
		String jdk="jdk";
		String version="21";
		String java =jdk+ version;
		
		System.out.println(jdk);
		System.out.println(version);
		System.out.println(java);
		
		String cart ="라면";
		System.out.println(cart);
		
		//배열-여러개의 자료 저장
		String carts[]= {"라면","빵","생수","화장지"};
		
		System.out.println(carts[0]);
		System.out.println(carts[1]);
		System.out.println(carts[2]);
		System.out.println(carts[3]);
		
		
		
		
		
		
	}

}
