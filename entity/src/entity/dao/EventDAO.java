package entity.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entity.pojo.Event;

public class EventDAO {

	private List<Event> allEventList = new ArrayList<Event>();
	private long id = 0;
	static EventDAO instance;

	public static synchronized EventDAO getInstance(){
		if(instance == null){
			instance = new EventDAO();
		}
		return instance;
	}
	
	public EventDAO() {
		Date now = new Date();
		allEventList.add(new Event(nextId(), 1, "event 1", now));
		allEventList.add(new Event(nextId(), 2, "event 2", now));
		allEventList.add(new Event(nextId(), 3, "event 3", now));
		allEventList.add(new Event(nextId(), 1, "event 4", now));
		allEventList.add(new Event(nextId(), 4, "event 5", now));
	}
	
	long nextId() {
		return ++id;
	}
	
	public Event getById(long id) {
		Event event = null;
		for (Event e : allEventList)
			if (id == e.getId()) {
				event = e;
				break;
			}
		return event;
	}
	
	public List<Event> getAllEvents() {
		return allEventList;
	}
	
	public boolean save(Event event) {
		return allEventList.add(event);
	}
	
	public boolean update(Event event) {
		long id = event.getId();
		int index = -1;
		for (Event e : allEventList)
			if (id == e.getId()) {
				index = allEventList.indexOf(e);
				break;
			}
		if (index == -1)
			return false;
		else {
			allEventList.set(index, event);
			return true;
		}
	}
	
	public boolean delete(Event event) {
		return allEventList.remove(event);
	}
}
