package entity.service;

import java.util.List;

import entity.pojo.Event;

public interface EventService {

	public Event findById(long id);
	public List<Event> findAll();
	public boolean save(Event event);
	public boolean update(Event event);
	public boolean remove(Event event);
}
