package si.slotex.web.slotexnlpapp;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
@Route("")
public class view extends HorizontalLayout{
	public view(){
		Button gumb = new Button("view");
		add(gumb);
	}
}