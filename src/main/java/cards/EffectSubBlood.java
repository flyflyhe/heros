package cards;

import character.Hero;

public class EffectSubBlood extends Effect {

	@Override
	public void handle(Hero... heros) {
		// TODO Auto-generated method stub
		for (Hero hero : heros) {
			hero.subBloods(getBlood());
		}
	}

	public EffectSubBlood() {
		setId(1);
		setBlood(1);
	}
}
