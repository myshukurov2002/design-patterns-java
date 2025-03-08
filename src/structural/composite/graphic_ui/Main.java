package structural.composite.graphic_ui;

public class Main {
    public static void main(String[] args) {
        Panel panel = new Panel("Menu");

        panel.addComponent(
                new Button("File"),
                new Button("Settings"),
                new Button("Print"),
                new Label(new Panel("new"))
        );

        panel.getDetails();
    }
}
