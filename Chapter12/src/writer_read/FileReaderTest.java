package writer_read;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		/*
		 * 파일 입출력 프로세스
		 * 1. 파일을 연다(파일 경로-절대 경로, 상대 경로)
		 * 2.파일을 읽는다.
		 * 3. 파일을 닫는다. 
		 * */
		//1.열기
		try {
			Reader reader = new FileReader("c:/File/text.txt");
			//2.읽기
			while(true) {
				int data =reader.read();
				
				//-1은 문자가 없음을 의미 
				if(data==-1)break;
				System.out.print((char)data);//문자형 형 변환 후 출력
				
			}
			
		} catch (FileNotFoundException e) {//자식
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {//부모
			
			e.printStackTrace();
		}//중첩문, 위에가 자식, 아래가 부모
		
		
		

	}

}
