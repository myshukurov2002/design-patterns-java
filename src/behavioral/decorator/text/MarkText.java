package behavioral.decorator.text;

public class MarkText extends TextDecorator {
    public MarkText(Text text) {
        super(text);
    }

    @Override
    public String render() {
        return "<mark>" + text.render() + "</mark>";
    }
}
