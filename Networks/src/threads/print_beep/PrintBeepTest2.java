package threads.print_beep;

public class PrintBeepTest2 {

	public static void main(String[] args) {
		//메인 스레드와 작업 스레드(소리 재생)가 동시에 실행 
		//자동 형변환(인터페이스 형으로 객체 생성)
		
		//BeepTask 파일에서 가져오는거임 . 소리나는 기능, 아래의 출력과 <병렬> 로 시행될 수 있도록 
		Runnable beepTask =new BeepTask();
		//작업 스레드의 객체 생성 
		Thread thread= new Thread(beepTask);
		thread.start();// 작업 스레드 시작 
		
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
		
	}

}
