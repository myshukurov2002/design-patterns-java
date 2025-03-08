package behavioral.decorator.text;

class PlainText implements Text {
    private String content;

    public PlainText(String content) {
        this.content = content;
    }

    public String render() {
        return content;
    }
}