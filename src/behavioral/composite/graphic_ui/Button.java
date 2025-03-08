package behavioral.composite.graphic_ui;

public class Button implements UIComponent {

    private String text;
    private int margin;
    private int border;
    private int padding;

    public Button(String text) {
        this.text = text;
        this.margin = 2;
        this.border = 2;
        this.padding = 2;
    }

    public Button(String text, int margin, int border, int padding) {
        this.text = text;
        this.margin = margin;
        this.border = border;
        this.padding = padding;
    }

    @Override
    public void getDetails() {
        System.out.println(
                "Button: Text: " + text + " Margin: " + margin +
                        " Border: " + border + " " + padding
        );
    }
}
