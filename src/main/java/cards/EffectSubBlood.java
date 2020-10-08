package cards;

import character.Hero;

public class EffectSubBlood extends Effect {
	int id = 1;
	
	int blood = 1;
	
	@Override
	public void handle(Hero... heros) {
		// TODO Auto-generated method stub
		for (Hero hero : heros) {
			hero.subBloods(blood);
		}
	}

}
