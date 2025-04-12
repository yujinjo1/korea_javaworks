package reference;

//Point- 점(좌표)을 추상화한 클래스
public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		
	}
	
	//접근자(getter) 메소드
	public int getX() {return x;}
	public int getY() {return y;}

}
