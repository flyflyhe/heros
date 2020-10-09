package cards;

import character.Hero;

public abstract class Skill {
	protected String name;

	protected int id;

	protected int effect;

	protected int[] answerIdList;
	
	public Skill() {
	    super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setEffect(int effect) {
		this.effect = effect;
	}

	public void setAnswerIdList(int[] answerIdList) {
		this.answerIdList = answerIdList;
	}

	public int[] getAnswerIdList() {
		return answerIdList;
	}

	public int getEffect() {
		return  effect;
	}
	
	public void use(Hero... hero) {
		
	}
}
