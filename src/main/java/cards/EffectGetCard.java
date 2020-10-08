package cards;

import java.util.ArrayList;

import character.Hero;

public class EffectGetCard extends Effect {
	int id = 3;
	
	ArrayList<Card> cards = new ArrayList<>();
	
	@Override
	public void handle(Hero... heros) {
		// TODO Auto-generated method stub
		for (Hero hero : heros) {
			Card card = hero.getCardRandom();
			this.cards.add(card);
		}
	}
	
	public ArrayList<Card> getCards() {
		return this.cards;
	}
}
