package Operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		//변수값 교환, 대입연산자('=')
		int x =0;
		int y =1;
		
		System.out.println("*****교환전******");
		System.out.println("x="+x+",y="+y);
		
		
		//연산(교환)
		int temp;//교환용 변수
		temp =x;
		x=y;
		y=temp;
		
		

		System.out.println("*****교환후******");
		System.out.println("x="+x+",y="+y);
		System.out.println();//한 줄 간격
		
		//산술연산
		System.out.println("****산술연산****");
		int n1=4;
		int n2=5;
		System.out.println(n1+n2);
		System.out.println(n1-n2);
		System.out.println(n1*n2);
		System.out.println(n1/n2);//정수형(int)이라 손실됨.조치가 필요함
		System.out.println((double)n1/n2);//실수형 표준인 double써주기, float도 가능
		System.out.println(n1%n2);//나머지
		
		System.out.println("****증감연산****");
		//++(1증가), --(1감소)
		int a= 99;
		
		System.out.println(a++);//a=a+1 ,다음꺼에서 증가됨. 후치연산
		System.out.println(a);
		
		System.out.println(++a);//a=a+1 전치증가(바로 증가된거 출력!)
		
		System.out.println(a--);//a=a-1후치감소
		System.out.println(a);//a=a-1후치감소
		
		
		System.out.println(--a);//a=a-1전치감소
		
		
	}

}
