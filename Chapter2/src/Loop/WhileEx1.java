package Loop;

public class WhileEx1 {

	public static void main(String[] args) {
		// 반복문- 초기값,종료값,증감값 세가지 요소가 충족되어야함..
		int n=1;//초기값! 원래는 0부터 시작한다.
		
//		while(n >= 10) {//종료값(조건식)
//			System.out.println("hello"+n);
//			n--; //n=n+1, n +=1 //증감값
//		}
		
		//1~10까지의 합계
		int sum =0;//합계를 저장할 변수 sum선언
		double avg;
		
		while(n<=10) {
			sum += n; //sum= sum +n;
			System.out.println("n="+n+",sum="+sum);
			n++;
		}
		//평균=합계/개수
		avg=(double)sum/(n-1);
		
		
		
		

	}

}
