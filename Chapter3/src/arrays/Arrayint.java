package arrays;

public class Arrayint {

	public static void main(String[] args) {
		//배열- 여러개의 연속된 자료를 저장하는 자료 구조 이다. 
		//배열의 길이가 4인 정수형 배열 선언
		//방법1-비워놓고 시작
		
		//int[] number= new int[4];
		
		//0번 인덱스 접근(조회)
		//System.out.println(number[0]);
		
		//전체 조회
//		for (int i=0; i<4; i++) {//0,1,2,3이니까
//			System.out.println(number[i]);
//		}
		//자료 조회
		//요소(값) 저장
//		number[0]=10;
//		number[1]=20;
//		number[2]=30;
//		number[3]=40;
		
		//방법2-배열의 선언과 동시에 초기화(입력)하고 시작
		int[] number = {10,20,30,40,50};//처음부터 초기화
		
		//배열의 크기(길이)
		System.out.println("배열의 길이:"+number.length);
		
		//요소 수정
		number[2]=100;//100을 대입-수정
		
		//전체 출력
		for(int i=0; i<number.length; i++) {//문자의 배열만큼!!i<number.lenth <= 포함하는거 쓰면 안된다. 무조건 더 작아야해0부터니깐.
			
			System.out.print(number[i]+" ");
		}
		System.out.println();
		//연산
		System.out.println(number[0]+number[1]);
		
		//전체합계
		System.out.println();
		int total=0;//합계를 저장할 변수
		
		for(int i=0; i<number.length; i++) {
			//계산
			total=total+number[i];//total +=number[i];
			
		}System.out.println("합계:"+total);
		System.out.println("평균:"+((double)total/number.length));
		System.out.println();
//for문 안에 {print넣으면}->출력도 반복된다ㅠㅠ 주의하기!!

	
	}
}
