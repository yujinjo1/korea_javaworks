package random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		/*
		 * 숫자 추측 게임
		 * 1. 컴퓨터가 난수를 생성함(1-30)사이
		 * 2. 사용자가 추측한 수 입력
		 * 3. 추측한 수와 컴퓨터 난수가 일치하면"정답", 
		 * 추측한 수가 크면"너무 커요" 아니면 "너무 작아요 출력
		 * 4. 숫자 범위를 초과 했을 때 "범위를 초과했습니다" 안내메세지 출력하기 
		 * */

		Random rnd =new Random();
		Scanner sc =new Scanner(System.in);
		
		//컴퓨터 난수 생성
		int com=rnd.nextInt(30)+1; //1~30
		while(true) {
			System.out.println("숫자를 입력하세요(1-30): ");
			int you=sc.nextInt();
			
			
			if(you<1 || you>30) {
				System.out.println("범위가 아니에요. 다시 입력하세요 ");
			}else if(you==com) {
				System.out.println("정답!");
				break;
			
			}
			else if(you>com) {
				System.out.println("너무 커요");
				
			}
			else {
				System.out.println("너무 작아요! ");
			}
			
//			if(you<=30 && you>=1) {
//				if(you==com) {
//					System.out.println("정답!");
//					break;
//				
//				}
//				else if(you>com) {
//					System.out.println("너무 커요");
//					
//				}
//				else if(you<com){
//					System.out.println("너무 작아요! ");
//				}
//			}
//			else {
//				System.out.println("범위가 아니에요. 다시 입력하세요 ");
//			}
		
		}
		sc.close();
	}

}
