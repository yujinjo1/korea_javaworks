package arrays;

public class CalcArray2 {
	public static void main(String[] args) {
		int[] score =new int[] {75,90,80,60};
		int sum=0;
		float avg;//4바이트형의 실수 , 소수점 정확한 값 도출
		for(int i=0; i<score.length; i++) {
			sum+=score[i];
		}
		avg= (float)sum/score.length;
		
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
	}

}
