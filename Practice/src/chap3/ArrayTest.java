package chap3;

public class ArrayTest {

	public static void main(String[] args) {
		/*
		 * 배열 길이가 5인 정수 배열을 선언하고, 1~10중 짝수만을 배열에 저장한 후
		 * 그 합과 평균을 계산하세요
		 * */
		
		//int[] arr= {2,4,6,8,10};
		int[] arr =new int[] {2,4,6,8,10};
		
		int total=0;//합계를 저장할 변수
		double avg;//평균을 저장할 변수, avg는 total값을 이용한 것이기 때문에 초기화 안시켜줘도 된다.
		
		for(int i=0; i<arr.length; i++) {
			total += arr[i];
			//total = total + arr[i];
			
			
		}
		//평균 계산
		avg = (double)total/arr.length;
		System.out.println("합계: "+total);
		System.out.println("평균: "+avg);
		

	}

}
