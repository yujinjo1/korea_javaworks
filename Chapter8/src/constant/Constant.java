package constant;

public class Constant {
//전역변수
	static int num=10;
	static final int NUM=100;//final-상수 설정(값 변환 못함)
	
	public static void main(String[] args) {
		
		num=20;
		//NUM=1000;//변경 불가
		
		System.out.println(num);
		System.out.println(NUM);

	}

}
