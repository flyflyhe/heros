package cards;
import character.Hero;

public class SkillRelease extends Skill {
	public SkillRelease() {
		setId(6);
		setName("无懈可击");
		setEffect(3);
		setAnswerIdList(new int[]{3, 4, 5});
	}
}
