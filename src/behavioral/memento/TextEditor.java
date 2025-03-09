package behavioral.memento;

public class TextEditor {

    private String text = "";

    public void write(String text) {
        this.text += text;
    }

    public String getText() {
        return text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento textMemento) {
        text = textMemento.getText();
    }


}
