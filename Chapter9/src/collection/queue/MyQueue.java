package collection.queue;

import java.util.ArrayList;

//문자열을 저장할 Queue 자료를 구현한 클래스 

public class MyQueue {
	private ArrayList<String> arrayQueue;
	
	public MyQueue() {
		arrayQueue = new ArrayList<>();
		
	}

	//요소 추가- 큐의 맨 뒤에 추가 
	
	public void enQueue(String data) {
		arrayQueue.add(data);
		
	}
	// 요소 삭제- 큐의 맨 앞(0번 인덱스)에서 삭제
	public String deQueue() {
		int len = arrayQueue.size();
		if(len ==0) {
			System.out.println("스택이 비었습니다.");
			return null; //비어있음. 
		}
	
		return arrayQueue.remove(0);
	}
}
