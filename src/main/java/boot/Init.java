package boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

import cards.Card;
import cards.CardConfig;
import cards.SkillDodge;
import cards.SkillKill;
import cards.SkillOutOfOnePocket;
import cards.SkillRelease;
import cards.SkillSummonWolves;
import cards.SkillTenThousandSwords;

public class Init {
	public static ArrayList<CardConfig> cardConfigs = new ArrayList<CardConfig>(
			Arrays.asList(
					new CardConfig(0,1, new SkillKill()),
					new CardConfig(0,2, new SkillKill()),
					new CardConfig(0,3, new SkillKill()),
					new CardConfig(0,4, new SkillKill()),
					new CardConfig(0,5, new SkillKill()),
					new CardConfig(0,6, new SkillKill()),
					new CardConfig(0,7, new SkillKill()),
					new CardConfig(0,8, new SkillKill()),
					new CardConfig(0,9, new SkillKill()),
					new CardConfig(0,10, new SkillSummonWolves()),
					new CardConfig(0,11, new SkillSummonWolves()),
					new CardConfig(0,12, new SkillTenThousandSwords()),
					new CardConfig(0,13, new SkillTenThousandSwords()),
					
					new CardConfig(1,1, new SkillDodge()),
					new CardConfig(1,2, new SkillDodge()),
					new CardConfig(1,3, new SkillDodge()),
					new CardConfig(1,4, new SkillDodge()),
					new CardConfig(1,5, new SkillDodge()),
					new CardConfig(1,6, new SkillOutOfOnePocket()),
					new CardConfig(1,7, new SkillOutOfOnePocket()),
					new CardConfig(1,8, new SkillOutOfOnePocket()),
					new CardConfig(1,9, new SkillOutOfOnePocket()),
					new CardConfig(1,10, new SkillRelease()),
					new CardConfig(1,11, new SkillRelease()),
					new CardConfig(1,12, new SkillRelease()),
					new CardConfig(1,13, new SkillRelease())
			)
	);
	
	
	public Stack<Card> cardStack = new Stack<Card>();
	
	public Init() {
		ArrayList<CardConfig> cardConfigs = Init.cardConfigs;
		Collections.shuffle(cardConfigs);
		
		for (CardConfig cardConfig : cardConfigs) {
			cardStack.add(new Card(cardConfig.getColor(), cardConfig.getNumber(), cardConfig.getSkill()));
		}
	}
}
