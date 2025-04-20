package reference.score;

public class Student {
	private int studentId;
	private String studentName;
	private Subject korean;
	private Subject math;
	
	
	//생성자
	
	public Student(int studentId, String studentName) {
		this.studentId=studentId;
		this.studentName=studentName;
		
		korean =new Subject();
		math=new Subject();
		
		
	}
	//국어 점수 설정
	public void setKoreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
		
		}
	
	public void setMathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
		
		}
	public void showStudentInfo() {
		System.out.println(
				"학번:"+studentId+
				"\n이름:"+studentName+
				"\n국어 점수:"+korean.getScorePoint()+
				"\n수학 점수:"+math.getScorePoint());
		System.out.println("----------------------------");
				
				
			
	}

}
