package cards;


import com.google.gson.annotations.SerializedName;

public class Card {
	public static String[] colorMap = {"黑", "红", "梅", "方"};

	public int color;

	public int number;

	public Skill skill;

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

	public int getColor() {
		return color;
	}

	public int getNumber() {
		return number;
	}
}
