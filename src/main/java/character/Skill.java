package character;

public abstract class Skill {
	String name;
	
	int aoe = 0;
	
	public abstract void use(Hero... hero);
}
