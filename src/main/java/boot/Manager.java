package boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Stack;

import cards.Card;
import cards.CardConfig;
import cards.SkillDodge;
import cards.SkillKill;
import cards.SkillOutOfOnePocket;
import cards.SkillRelease;
import cards.SkillSummonWolves;
import cards.SkillTenThousandSwords;
import sockets.Room;

public class Manager {
	public static ArrayList<CardConfig> cardConfigs = new ArrayList<CardConfig>(
			Arrays.asList(new CardConfig(0, 1, new SkillKill()), new CardConfig(0, 2, new SkillKill()),
					new CardConfig(0, 3, new SkillKill()), new CardConfig(0, 4, new SkillKill()),
					new CardConfig(0, 5, new SkillKill()), new CardConfig(0, 6, new SkillKill()),
					new CardConfig(0, 7, new SkillKill()), new CardConfig(0, 8, new SkillKill()),
					new CardConfig(0, 9, new SkillKill()), new CardConfig(0, 10, new SkillSummonWolves()),
					new CardConfig(0, 11, new SkillSummonWolves()), new CardConfig(0, 12, new SkillTenThousandSwords()),
					new CardConfig(0, 13, new SkillTenThousandSwords()),

					new CardConfig(1, 1, new SkillDodge()), new CardConfig(1, 2, new SkillDodge()),
					new CardConfig(1, 3, new SkillDodge()), new CardConfig(1, 4, new SkillDodge()),
					new CardConfig(1, 5, new SkillDodge()), new CardConfig(1, 6, new SkillOutOfOnePocket()),
					new CardConfig(1, 7, new SkillOutOfOnePocket()), new CardConfig(1, 8, new SkillOutOfOnePocket()),
					new CardConfig(1, 9, new SkillOutOfOnePocket()), new CardConfig(1, 10, new SkillRelease()),
					new CardConfig(1, 11, new SkillRelease()), new CardConfig(1, 12, new SkillRelease()),
					new CardConfig(1, 13, new SkillRelease())));

	public static final int maxRoom = 1;

	public static final Room[] roomArr = new Room[1];

	public static final HashMap<Integer, Room> sidRoom = new HashMap<>();


	public Manager() {

		for (int i = 0; i < maxRoom; i++) {
			roomArr[i] = new Room();
		}
	}

	public Room getRoom(int id) {
		if (sidRoom.containsKey(id)) {
			return sidRoom.get(id);
		} else {
			for (Room room : roomArr) {
				if (room.status == 0) {
					if (room.sidHeroMap.size() <= room.MaxUsers) {
						synchronized (roomArr) {
							if (room.sidHeroMap.size() <= room.MaxUsers) {
								room.sidHeroMap.put(id, null);
								sidRoom.put(id, room);
								room.selectSeat(id);
							}

							if (room.sidHeroMap.size() == room.MaxUsers) {
								room.status = 1;
							}
						}
					}

					return room;
				}
			}
		}

		return null;
	}
}
