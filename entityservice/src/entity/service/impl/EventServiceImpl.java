package entity.service.impl;

import java.util.List;

import entity.dao.EventDAO;
import entity.pojo.Event;
import entity.service.EventService;

public class EventServiceImpl implements EventService {

	private EventDAO eventDao = EventDAO.getInstance();
	
	@Override
	public Event findById(long id) {
		return eventDao.getById(id);
	}

	@Override
	public List<Event> findAll() {
		return eventDao.getAllEvents();
	}

	@Override
	public boolean save(Event event) {
		return eventDao.save(event);
	}

	@Override
	public boolean update(Event event) {
		return eventDao.update(event);
	}

	@Override
	public boolean remove(Event event) {
		return eventDao.delete(event);
	}

}
