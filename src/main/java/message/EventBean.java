package message;

public class EventBean {
	private String name;

	private Object object;
	
	public EventBean() {
		
	}
	
	public EventBean(String name, Object object) {
		setName(name);
		setObject(object);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}
