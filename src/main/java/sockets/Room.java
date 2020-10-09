package sockets;

import java.util.HashMap;
import java.util.Map;

import character.Hero;

public class Room {
	
	public int id;
	
	/**
	 * 0:空闲
	 * 1:进行中
	 */
	public int status = 0;
	
	public int time;
	
	public int MaxUsers = 4;
	
	public Map<Integer, Hero> sidHeroMap = new HashMap<>();

	public int one;

	public int two;

	public int three;

	public int four;

	public Room() {
	
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
