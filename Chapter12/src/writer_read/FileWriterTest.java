package writer_read;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest {

	public static void main(String[] args) {
		/*
		 * 파일 입출력 프로세스
		 * 1. 파일을 연다(파일 경로-절대 경로, 상대 경로)
		 * 2.파일을 쓴다
		 * 3. 파일을 닫는다. 
		 * */
		try {
			Writer writer=new FileWriter("C:/File/text.txt");
			Writer writer2=new FileWriter("C:/File/ujin.txt");
			//한 개의 문자 쓰기 
			writer.write('A');
			writer.write('b');
			
			//아스키 코드값 쓰기
			writer.write(49); //1
			
			//배열을 사용하여 문자 쓰기 
			char[] arr = {'C','D','E'};
			writer.write(arr);
			
			//줄 바꿈 기호 
			writer.write('\n'); 
			
			//문자열 쓰기 
			writer.write("korea");
			writer.write("좋아요");
			writer2.write("유진이");
			
			writer.flush(); //버퍼의 데이터 강제 쓰기 (출력)
			writer.close(); //파일 닫기 
			writer2.close(); //파일 닫기 !! 닫아줘야 보임
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
