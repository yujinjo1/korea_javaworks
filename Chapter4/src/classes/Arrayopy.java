package classes;

public class Arrayopy {
	public static void main(String[] args) {
		//정수형 배열 복사
		int[] arr1 = {1,2,3,4};
		int[] arr2 =new int[4];
		
		//인덱싱
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);
		
		//전체 출력
		System.out.println("****arr1출력*****");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i]+"");
			 
		}
		System.out.println();
		
		//복사 전 
		System.out.println(arr2[0]);  //0
		
		//arr1을 arr2에 복사하기 - 첫번째 요소 복사
		arr2[0]=arr1[0];
		System.out.println(arr2[0]); //1
		
		//arr1을 arr2에 전체 복사
		for(int i=0; i<arr1.length; i++) {
			arr2[i]=arr1[i];
			
		
		}
		//arr2출력
		System.out.println("****arr2출력*****");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i]+"");
			 
		}
		
		
	}

}
