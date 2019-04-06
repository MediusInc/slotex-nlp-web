package si.slotex.nlp.gui;

import com.vaadin.flow.component.accordion.Accordion;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Viewport;

@Viewport("width=device-width, initial-scale=1.0, user-scalable=yes")
public class SlotexCommonUI extends VerticalLayout {
        protected HorizontalLayout header;
        protected HorizontalLayout body;
        protected HorizontalLayout footer;

    public SlotexCommonUI (){
        setSizeFull();
        setId("CommonUI");
        initHeader();
        initBody();
        initFooter();
        add(header);
        add(body);
        add(footer);
    }
    private void initHeader(){
        header = new HorizontalLayout();
        header.setWidthFull();
        header.setId("header");
        H1 tittle = new H1("SloTex");
        tittle.setId("tittle");
        header.add(tittle);
    }
    private void initBody(){
        body = new HorizontalLayout();
        body.setWidthFull();
        body.setId("body");
        VerticalLayout sidebar = initSidebar();
        HorizontalLayout contentWindow = initContentWindow();
        body.add(sidebar);
        body.add(contentWindow);
    }
    private VerticalLayout initSidebar(){
        VerticalLayout sidebar = new VerticalLayout();
        sidebar.setId("sidebar");
        //sidebar.setFlexGrow(1);
        Accordion menu = new Accordion();
        menu.setId("menu");
        VerticalLayout adminMenu = new VerticalLayout();
        Span docs = new Span("PROCESSED DOCUMENTS");
        Span entities= new Span("TAGGED ENTITIES");
        Span processing = new Span("IN PROCESSING");
        Span info = new Span("INFORMATIONS");
        docs.addClassName("optionsMenu");
        entities.addClassName("optionsMenu");
        processing.addClassName("optionsMenu");
        info.addClassName("optionsMenu");
        adminMenu.add(docs,entities,processing,info);
        VerticalLayout learnMenu = new VerticalLayout();
        Span manage= new Span("MANAGE");
        Span models = new Span("MODELS");
        Span corpora = new Span("CORPORA");
        manage.addClassName("optionsMenu");
        models.addClassName("optionsMenu");
        corpora.addClassName("optionsMenu");
        learnMenu.add(manage,models,corpora);
        menu.add("Administration",adminMenu);
        menu.add("Learn",learnMenu);
        sidebar.add(menu);
        return sidebar;
    }
    private HorizontalLayout initContentWindow(){
        HorizontalLayout contentWindow = new HorizontalLayout();
        VerticalLayout view = new VerticalLayout();
        contentWindow.setId("content");
        view.add("Lorem ipsum dolor sit amet");
        //view.setFlexGrow(1);
        contentWindow.add(view);
        return contentWindow;
    }
    private void initFooter(){
        footer = new HorizontalLayout();
        footer.setWidthFull();
        footer.setId("footer");
    }

    protected void setContent(VerticalLayout newView) { //swap views
        HorizontalLayout content = (HorizontalLayout) body.getComponentAt(1);
        VerticalLayout oldView = (VerticalLayout) content.getComponentAt(0);
        content.replace(oldView, newView);
    }
}