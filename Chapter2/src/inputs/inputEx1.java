package inputs;

import java.util.Scanner;

public class inputEx1 {

	public static void main(String[] args) {
		// 입력처리- Scanner 클래스 사용(임포트 필요)
		//System은 java.lang패키지 인데 임포트 안함
		
		//Scanner 객체 생성,뒤의 Scanner()는 생성자임
		//스캐너 open
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까?");
		String name= scanner.nextLine();//이름입력
		System.out.println("당신의 이름"+name+"이군요!");

		System.out.print("당신의 나이는 몇 세 입니까?");
		int age=scanner.nextInt();//나이입력
		System.out.println("당신의 나이는"+age+"이군요!");
		
		//Scanner 객체 종료
		scanner.close();
		
	}

}
