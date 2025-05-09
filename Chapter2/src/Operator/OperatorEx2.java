package Operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		// 비교연산자
		System.out.println("****비교연산****");
		
		//"==":같다, "!="같지 않다
		int n1=10, n2=20;
		
		System.out.println(n1>=n2);
		System.out.println(n1<=n2);
		System.out.println(n1==n2);
		System.out.println(n1!=n2);
		
		
		System.out.println("****논리연산****");
		//"&&"-두 조건이 모두 참일때, 
		System.out.println((n1<=n2)&&(n1==n2));
		//"||"-두 조건중 하나만 참이어도 참 
		System.out.println((n1<=n2)||(n1==n2));
		
		//"!"-논리부정( 조건이 참이면 거짓, 거짓이면 참)
		
		System.out.println(!(n1==n2));//같은게 거짓이니까 참값 출력
		
		
		System.out.println("****복합 대입 연산****");
		int num3=10;
		System.out.println(num3=num3+2);
		System.out.println(num3+=2);//위에꺼랑 같음
		System.out.println(num3-=4);
		System.out.println(num3*=2);
		System.out.println(num3/=2);
		System.out.println(num3%=2);//2로 나눈 나머지. 딱 떨어져서 나머지 0
		
		System.out.println("***조건연산***");
		//부모나이 비교- 아빠나이가 엄마 나이보다 크면 결과
		
		int fatherAge=55;
		int motherAge=57;
		
		//1. 결과값-'T', 'F'(자료형 char) 단일문자!!!
		char result1;
		
		//2. 결과값-true/ false
		boolean result2;
		
		//3. 결과값-"아빠가 연상", "엄마가 연상", string은 문자열을다룸(연속)
		String result3;
		
		result1= (fatherAge>motherAge)?'T' :'F';
		System.out.println(result1);
		
		result2= (fatherAge>motherAge)? true :false;
		System.out.println(result2);

		result3= (fatherAge>motherAge)? "아빠가 연상" :"엄마가 연상";
		System.out.println(result3);



	}

}
