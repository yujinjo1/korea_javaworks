package array2d;

public class ApartmentTest {

	public static void main(String[] args) {
		//아파트 구조를 저장할 배열 생성
		int[][]household=new int[5][3];
		household[2]=new int[1];    //3 층은 1차원 배열 
		
		//배열의 크기 (행)
		System.out.println(household.length);
		System.out.println(household[0].length);
		
		//세대수 출력
		System.out.printf("5층 %d 세대\n",household[4].length);
		System.out.printf("4층 %d 세대\n",household[3].length);
		System.out.printf("3층 %d 세대\n",household[2].length);
		System.out.printf("2층 %d 세대\n",household[1].length);
		System.out.printf("1층 %d 세대\n",household[0].length);

	}

}
