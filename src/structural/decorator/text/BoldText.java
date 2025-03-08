package structural.decorator.text;

class BoldText extends TextDecorator {
    public BoldText(Text text) {
        super(text);
    }

    public String render() {
        return "<b>" + text.render() + "</b>";
    }
}