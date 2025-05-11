package abstract_class.game_level;

public class SuperLevel extends PlayerLevel{

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프합니다.");
	}

	@Override
	public void turn() {
		System.out.println("잘 돌아요");		
	}

	@Override
	public void showLevelMessage() {
		System.out.println("*********고급자 레벨***********");
		
	}

}
