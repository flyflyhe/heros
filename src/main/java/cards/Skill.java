package cards;

import character.Hero;

public abstract class Skill {
	public String name;
	
	public int id = 0;
	
	public int effect = 0;
	
	public int[] answerIdList = {};
	
	public Skill() {
	    super();
	}

	public int getId() {
		return id;
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
