package Loop;

public class ForEx1 {

	public static void main(String[] args) {
		// for(초기값;종료값;증감값)
		//1~10까지 출력
		
		for(int n=1; n<=10; n++) {
			System.out.print(n+" ");
		}
		
		System.out.println();//줄바꿈  
		//1~10까지의 합계와 평균
		int total =0;//합계를 저장할 정수형 변수
		
		double avg;//평균을 저장할 실수형 변수
		int n;//반복 횟수 변수()
		for(n=1; n<=10; n++) {
			total+=n;//total=total+n
		}

		//평균=합계/개수
		avg= total/10;
		avg=(double)total/10;//정수 total을 실수로 형변환
		avg=(double)total/(n-1);
		
		System.out.println("합계:"+total);
		System.out.println("평균:"+avg);
		
		

}
}
