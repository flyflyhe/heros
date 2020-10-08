package cards;

import java.util.HashMap;
import java.util.Map;

import character.Hero;

public abstract class Effect {
	int id = 0;
	
	public final static Map<Integer, String> NAV_ITEM_ADPTER = new HashMap<Integer, String>() {
	    /**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		{
	       put(1, "减血");
	       put(2, "加血");
	       put(3, "获取牌");
	       put(4, "抽取牌");
	       put(5, "减去状态");
	    }
	};
	
	public abstract void handle(Hero... heros);
	
	public int getId() {
		return id;
	}
}
