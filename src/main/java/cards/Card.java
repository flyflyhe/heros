package cards;


public class Card {
	public static String[] colorMap = {"黑", "红", "梅", "方"};
	
	int color;
	
	int number;
	
	Skill skill;

	public Card(int color, int number) {
		super();
		this.color = color;
		this.number = number;
	}

	public Card(int color, int number, Skill skill) {
		super();
		this.color = color;
		this.number = number;
		this.skill = skill;
	}
	
	public Skill getSkill() {
		return this.skill;
	}
}
