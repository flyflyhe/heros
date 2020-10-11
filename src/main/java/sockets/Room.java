package sockets;

import boot.Manager;
import cards.Card;
import cards.CardConfig;
import cards.Skill;
import character.HeroDemo;
import events.EventSendCard;

import com.google.gson.Gson;

import message.EventBean;
import message.HeroBean;
import org.java_websocket.WebSocket;

import java.util.*;
import java.util.stream.Stream;

import character.Hero;

public class Room {
	public final Stack<Card> cardStack = new Stack<Card>();
	
	public Map<String, Skill> cardSkillMap = new HashMap<String, Skill>();
	public int id;
	
	/**
	 * 0:空闲
	 * 1:进行中
	 */
	public int status = 0;
	
	public int time;
	
	public int MaxUsers = 4;
	
	public Map<Integer, Hero> sidHeroMap = new HashMap<>();

	public Map<Integer, WebSocket> sidSocketMap = new HashMap<>();

	public int one;

	public int two;

	public int three;

	public int four;

	public Room() {
	}

	public void initStack() {
		ArrayList<CardConfig> cardConfigs = Manager.cardConfigs;
		Collections.shuffle(cardConfigs);

		for (CardConfig cardConfig : cardConfigs) {
			Card card = new Card(cardConfig.getColor(), cardConfig.getNumber(), cardConfig.getSkill());
			cardSkillMap.put(card.getId(), card.getSkill());
			if (!cardStack.add(card)) {
				System.out.println("入栈失败");
			}
		}
	}

	private boolean sendCard = false;

	public void sendCard() {
		if (!sendCard) {
			synchronized (this) {
				if (!sendCard) {
					System.out.println("发牌");
					Gson gson = new Gson();
					sidSocketMap.forEach((Integer sid, WebSocket webSocket) -> {
						Hero hero = sidHeroMap.get(sid);
						for(int i = 0; i < 3; ++i) {
							Card card = cardStack.pop();
							hero.addCards(card);
						}
						
					
						HeroBean heroBean = HeroBean.getHeroBean(hero);
						EventBean eventBean = new EventBean(EventSendCard.EventName, heroBean);
						
						System.out.println(cardStack.size());
						String eventJson = gson.toJson(eventBean);
						System.out.println("json:" + eventJson);
						webSocket.send(eventJson);
					});
					sendCard = true;
				}
			}
		}
	}

	public void clear() {
	}

	public void addSidSocket(Integer sid, WebSocket webSocket) {
		sidSocketMap.put(sid, webSocket);
	}

	public void sendCanPlay() {
		sidSocketMap.forEach((Integer sid, WebSocket webSocket) -> {
			webSocket.send("can play");
		});
	}

	public boolean canPlay() {
		return status == 1;
	}

	public int selectSeat(int sid) {
		if (one == 0) {
			one = sid;
		} else if (two == 0) {
			two = sid;
		} else if (three == 0) {
			three = sid;
		} else if (four == 0) {
			four = sid;
		} else {
			return 0;
		}

		return sid;
	}
}
