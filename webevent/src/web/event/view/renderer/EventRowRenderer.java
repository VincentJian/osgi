package web.event.view.renderer;

import java.text.SimpleDateFormat;

import org.zkoss.zul.Label;
import org.zkoss.zul.Row;
import org.zkoss.zul.RowRenderer;

import entity.pojo.Event;

public class EventRowRenderer implements RowRenderer<Event> {

	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
	
	@Override
	public void render(Row row, Event event, int index) throws Exception {
		new Label(event.getId() + "").setParent(row);
		new Label(event.getSummary()).setParent(row);
		new Label(event.getPriority() + "").setParent(row);
		new Label(sdf.format(event.getDate())).setParent(row);
	}

}
