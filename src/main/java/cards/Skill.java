package cards;

import character.Hero;

public abstract class Skill {
	String name;
	
	int id = 0;
	
	int effect = 0;
	
	int[] answerIdList = {};
	
	public Skill() {
	    super();
	}
	
	
	public String getName() {
		return name;
	}

	
	public int[] getAnswerIdList() {
		return answerIdList;
	}
	
	
	public void use(Hero... hero) {
		
	}
}
