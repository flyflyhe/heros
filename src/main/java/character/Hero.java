package character;

import java.util.ArrayList;
import java.util.Arrays;

import cards.Card;

public abstract class Hero {
	String name;
	
	String sex;
	
	int bloods = 0;
	
	private ArrayList<Skill> skills = new ArrayList<Skill>();
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	
	public boolean isAlive() {
		return this.bloods > 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Skill> getSkills() {
		return skills;
	}


	public void addSkill(Skill skill) {
		this.skills.add(skill);
	}
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public int getBloods() {
		return bloods;
	}

	public void setBloods(int bloods) {
		this.bloods = bloods;
	}
	
	public void subBloods(int blood){
		this.bloods -= blood;
	}
	
	public void addCards(Card... cards) {
		this.cards.addAll(Arrays.asList(cards));
	}

	public ArrayList<Card> getCards() {
		return cards;
	}

	public Card getCardRandom() {
		int a =(int)(1+Math.random()*(this.cards.size()-1+1));
		Card card =  this.cards.get(a);
		
		this.cards.remove(a);
		return card;
	}
}
