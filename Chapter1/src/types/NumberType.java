package types;

public class NumberType {

	public static void main(String[] args) {
		
		// 숫자 자료형
		System.out.println("****정수자료형****");
		//byte(1byte)-8bit(256개):-128~127
		byte bData1=127;//		byte bData1=128;//범위 초과로 오류발생->int
		
		System.out.println(bData1);
//		System.out.println(bData2);
		
		//int(4byte)-16bit(43억):-21억~21억
		int iNum1= 220000000; //카멜 표기법(앞에 작게 다른명사 크케)2억2천
		//int iNum1= 2200000000; //범위초과로 오류발생->long,22억
		
		System.out.println(iNum1);
		
		//long(8byte) -64bit
		long lNum1= 2200000000L;//'L'or'l'을 붙임.
		
		System.out.println(lNum1);
		
		
		System.out.println("****실수자료형****");
		//float(4byte)- 소수 6자리까지 출력<표준이아니라f붙임>
		float fNum =  1.2345678F;//'F'or'f'를 붙임.
		System.out.println(fNum);
		
		//double(8byte)- 소수 16자리<표준>
		double dNum =1.234567890123456789;
		System.out.println(dNum); 

	}

}
