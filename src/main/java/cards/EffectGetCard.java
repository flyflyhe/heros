package cards;

import java.util.ArrayList;

import character.Hero;

public class EffectGetCard extends Effect {
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

	public EffectGetCard() {
		setId(3);
	}
}
