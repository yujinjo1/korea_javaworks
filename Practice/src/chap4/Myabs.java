package chap4;

public class Myabs {
	
	//절댓값 계산 
	public static int myAbs(int x) {
		if(x<0)
			return -x;
		else return x;
		
		
	}

	public static void main(String[] args) {
		// 호출
		
		int value1= myAbs(-4);
		int value2= myAbs(4);
		System.out.println("myAbs(-4)="+value1);
		System.out.println("myAbs(4)="+value2);
		
		
		
		

	}

}
