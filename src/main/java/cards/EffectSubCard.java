package cards;

import character.Hero;

public class EffectSubCard extends Effect {
	int id = 4;
	
	int cardNum = 1;
	
	@Override
	public void handle(Hero... heros) {
		// TODO Auto-generated method stub
		for (Hero hero : heros) {
			hero.getCardRandom();
		}

	}

}
