package si.slotex.nlp.gui.pages.admin;

import com.vaadin.flow.router.Route;
import si.slotex.nlp.gui.ContentView;
import si.slotex.nlp.gui.SlotexMainLayout;

@Route(value = "info", layout = SlotexMainLayout.class)
public class AdminInfo extends ContentView {

    public AdminInfo() {
        add("AdminInfo");
    }
}
