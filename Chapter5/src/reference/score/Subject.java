package reference.score;

public class Subject {
	private String subjectName;
	private int scorePoint;
	
	//과목설정(setter)
	public void setSubjectName(String subjectName) {
		this.subjectName=subjectName;
		
	}
	
	public void setScorePoint(int scorePoint) {
		this.scorePoint=scorePoint;
		
	}
	//접근자 (getter)
	public String getSubjectName() {
		return subjectName;
		
	}
	
	public int getScorePoint() {
		return scorePoint;
	}
	


}
