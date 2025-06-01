package typing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TypingGame {
	
	public static void main(String[] args) {
		//1. 파일 읽기"word.txt"에서 단어 읽어오기
		try(BufferedReader br=new BufferedReader(
				new FileReader("word.txt"))){
			String str;
			String[] words=null;
			//분리된 단어를 저장할 배열
			//읽어온거를 str에 넣기 
			while((str=br.readLine())!=null) {
				words =str.split(" ");
				
			}
			
			
			//2. 영어 타자 게임
			int n=1;
			long start, end; //시작, 종료시간
			double elapsedTime; //소요 시간
			
			Scanner sc = new Scanner(System.in);
			System.out.println("[타자 게임],준비되면 엔터>");
			sc.nextLine();//엔터
			
			start= System.currentTimeMillis();//1970.1.1 자정이후 밀리초( ms)
			//System.out.println(start);
			
			while(n<11) {
				System.out.println("문제"+n);
				
				
				Random rnd =new Random();
				int rndIdx = rnd.nextInt(words.length);
				
				
				String question=words[rndIdx];//문제
				System.out.println(question);
				
				String answer =sc.nextLine();//사용자 단어 입력
				//question 과 answer비교
				if(answer.equals(question)) {
					System.out.println("통과!");
					n++;
					
				}else {
					System.out.println("오타! 다시 도전! ");
				}
				
			}//while닫기
			end=System.currentTimeMillis();
			elapsedTime=(double)(end-start)/1000;
			System.out.printf("게임시간:%.2f초",elapsedTime);
			
			
			//랜덤추출
			int rndIdx=(int)(Math.random()*words.length);
			System.out.println(words[rndIdx]);
		}catch(IOException e) {
			e.printStackTrace();
			
}
}
	}