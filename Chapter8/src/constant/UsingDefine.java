package constant;

public class UsingDefine {

	public static void main(String[] args) {
		// 상수사용(static변수이므로 클래스 이름으로 직접 접근)
		System.out.println(Define.GOOD_MORNING);
		System.out.println("최소값은"+Define.MIN+"입니다.");
		System.out.println("최대값은"+Define.MAX+"입니다.");
		System.out.println("영어 과목 코드값은"+Define.ENG+"입니다.");
		System.out.println("수학 과목 코드값은"+Define.MATH+"입니다.");
	}

}
