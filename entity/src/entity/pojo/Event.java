package entity.pojo;

import java.util.Date;

public class Event {
	private long id;
	private int priority;
	private String summary;
	private Date date;
	
	public Event() {
		super();
	}

	public Event(long id, int priority, String summary, Date date) {
		super();
		this.id = id;
		this.priority = priority;
		this.summary = summary;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
