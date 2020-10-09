package cards;

import character.Hero;

public class EffectSubCard extends Effect {

	@Override
	public void handle(Hero... heros) {
		// TODO Auto-generated method stub
		for (Hero hero : heros) {
			hero.getCardRandom();
		}

	}

	public EffectSubCard() {
		setId(4);
	}

}
