package web.event.controller;

import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zkplus.spring.SpringUtil;
import org.zkoss.zul.Grid;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.Window;

import web.event.view.renderer.EventRowRenderer;
import entity.pojo.Event;
import entity.service.EventService;

public class EventListComposer extends GenericForwardComposer<Window> {
	private static final long serialVersionUID = -6360281647587113096L;
	
	private Grid gdListEvent;
	
	@Override
	public void doAfterCompose(Window comp) throws Exception {
		super.doAfterCompose(comp);
		EventService eventService = (EventService) SpringUtil.getBean("eventService");
		gdListEvent.setModel(new ListModelList<Event>(eventService.findAll()));
		gdListEvent.setRowRenderer(new EventRowRenderer());
	}
}
