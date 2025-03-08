package behavioral.decorator.text;

class ItalicText extends TextDecorator {
    public ItalicText(Text text) {
        super(text);
    }

    public String render() {
        return "<i>" + text.render() + "</i>";
    }
}