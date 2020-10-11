package events;

public class EventSendCard extends Event {
	public static final String EventName = "sendCard";
	
	public EventSendCard() {
		setName(EventName);
	}
}
