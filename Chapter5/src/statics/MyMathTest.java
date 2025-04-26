package statics;

public class MyMathTest {

	public static void main(String[] args) {
		// 수학관련 클래스 제공 받음
		//static 을 포함한 메서드는 클래스 이름으로 직접 접근함(new 하지 않음)
		// 절대값 계산
		System.out.println("절대값: "+Math.abs(-5));
		System.out.println("절대값:"+MyMath.Myabs(-5));
		
		//거듭제곱 계산 (2x2x2- 2의 3승 )
		System.out.println("거듭제곱:"+Math.pow(2, 3));
		System.out.println("거듭제곱:"+MyMath.MyPow(2, 3));
		
		//1부터 4까지 곱하기 
		/*int hap =0;//합을 초기화 할때는 0****
		for(int i=1; i<=4; i++) {
			hap=hap+i;
			
		}
		System.out.println("합계: "+hap);
	
		
		int gop =1; //곱을 초기화 할때는 1 ***********
		for(int i=1; i<=4; i++) {
			gop*=i;//gop=gop*i;
			//1*2*3*4=4!
			
		}
		System.out.println("곱하기: "+gop);*/
	
		

	}

}





