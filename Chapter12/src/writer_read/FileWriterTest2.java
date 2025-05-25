package writer_read;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterTest2 {

	public static void main(String[] args) {
		// 기존파일에 추가로 내용 쓰기 ~!!!!  이 파일을 실행해야 보임. 
		try {
			Writer writer = new FileWriter("C:/File/text.txt",true);//true가 없으면 텍스트를 덮는다. 
			writer.write('\n');
			writer.write("오늘도 좋은하루 되세요~!");
			
			writer.flush();
			writer.close();
			
			System.out.println("추가 쓰기 완료! ");
			
			
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
