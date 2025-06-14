package threads.print_beep;

import java.awt.Toolkit;

public class PrintBeepTest {

	public static void main(String[] args) {
		// "핑" 문자 5번 출력하기 
		for(int i =1 ; i<=5; i++) {
			System.out.println("띵"); 
			//1초에 하나씩 써주게 만들자
			//시간 대기 메서드 -Tread.sleep(1000)- 1초
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//"핑" 소리 5번 재생하기 모듈-인포 파일 삭제 후 임포트 
		Toolkit toolkit= Toolkit.getDefaultToolkit();
		for(int i=1 ; i<=5; i++) {
			toolkit.beep();//beep()-> 소리 메서드 호출 
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
