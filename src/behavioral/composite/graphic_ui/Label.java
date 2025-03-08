package behavioral.composite.graphic_ui;

import java.util.LinkedList;
import java.util.List;

public class Label implements UIComponent{
    private List<Panel> panels = new LinkedList<>();

    public Label(Panel... panels) {

        this.panels
                .addAll(List.of(panels));
    }

    public boolean addPanel(Panel... panels) {
        return this.panels
                .addAll(List.of(panels));
    }

    @Override
    public void getDetails() {
        panels.forEach(Panel::getDetails);
    }
}
