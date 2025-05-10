package exceptions;

public class MultiException {

	public static void main(String[] args) {
		//여러개의 예외가 발생한 경우 처리 
		String[] array = {"100","123a"};
		
		for(int i=0; i<=array.length;i++) { //<=이걸 해주면 값이 0,1 밖에 없는데 실제로는, length는 0,1,2를 의미하기에 ...
			try {
				//System.out.println(array[i]);
				
				//문자열을 정수로 변환해보자
				int value = Integer.parseInt(array[i]);
				System.out.println(value);
			
			}catch(ArrayIndexOutOfBoundsException e) {//최상위 클래스기 때문에 출력 된다.Exception e 만 써도 됨
				System.out.println("배열 인덱스가 초과되었습니다.");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없는 항목이 있습니다.");
			}
		}

	}

}
