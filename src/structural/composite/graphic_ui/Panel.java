package structural.composite.graphic_ui;

import java.util.LinkedList;
import java.util.List;

public class Panel implements UIComponent {

    private String name;
    private List<UIComponent> components = new LinkedList<>();

    public Panel(String name) {
        this.name = name;
    }

    public boolean addComponent(UIComponent... components) {
        return this.components
                .addAll(List.of(components));
    }

    public boolean removeComponent(UIComponent... components) {
        return this.components
                .removeAll(List.of(components));
    }

    @Override
    public void getDetails() {
        System.out.println("\t\tPanel: Name: " + name);
        components
                .forEach(UIComponent::getDetails);
    }
}
