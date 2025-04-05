package arrays;

public class CalcArray {

	public static void main(String[] args) {
		//정수형 배열을 생성하고 연산
		//합계와 총점
		int[] score = new int[] {75,90,80,60};
		int sum =0;
		float avg; //4바이트형의 실수 , 소수점 정확한값 도출 
		
		for(int i=0; i<score.length; i++) {
			sum+=score[i]; //sum =sum +score[i];
		}
		//평균 = 합계/개수
		avg=(float)sum/score.length;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		//printf() 대응서식 %d-정수, %f-실수,%s-문자 
		System.out.printf("평균 :%.1f\n", avg);

		
		//최대값, 최솟값
		
		int max;
		max = score[0]; //배열의 첫번째 값을 최대값으로 설정
		
		for(int i=0; i<score.length;i++) {//반복문을 순회하면서
			if(score[i]>max) {//요소값과 최대값을 비교해서 
				max=score[i];//큰 값을 최대값에 저장
			}
		}
		System.out.println("최고점수: "+max);

	}

}
