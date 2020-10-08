package character;

import java.util.ArrayList;

import cards.Card;

public abstract class Hero {
	String name;
	
	String six;
	
	int bloods = 0;
	
	ArrayList<Skill> skills = new ArrayList<Skill>();
	
	ArrayList<Card> cards = new ArrayList<Card>();
	
	public Hero(String name, String six, int bloods) {
		super();
		this.name = name;
		this.six = six;
		this.bloods = bloods;
	}
	
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
	
	public String getSix() {
		return six;
	}

	public void setSix(String six) {
		this.six = six;
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
		for (Card card : cards) {
			this.cards.add(card);
		}
	}
	
	public Card getCardRandom() {
		int a =(int)(1+Math.random()*(this.cards.size()-1+1));
		Card card =  this.cards.get(a);
		
		this.cards.remove(a);
		return card;
	}
}
