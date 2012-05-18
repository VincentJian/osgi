package web.core.controller;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.util.GenericForwardComposer;
import org.zkoss.zul.Div;
import org.zkoss.zul.Window;

public class IndexComposer extends GenericForwardComposer<Window> {

	private static final long serialVersionUID = -7337007839915548484L;
	private Div content;
	
	public void onClick$eventBtn() {
		Executions.createComponents("~./event/list.zul", content, null);
	}
}
