package cards;

public class CardConfig {
	private int color;

	private int number;

	private Skill skill;

	public CardConfig(int color, int number, Skill skill) {
		super();
		this.color = color;
		this.number = number;
		this.skill = skill;
	}

	public int getColor() {
		return color;
	}

	public int getNumber() {
		return number;
	}

	public Skill getSkill() {
		return skill;
	}
	
	
}
