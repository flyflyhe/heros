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
	
	public Room() {
	
	}
}
