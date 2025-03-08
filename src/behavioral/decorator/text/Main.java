package behavioral.decorator.text;

public class Main {
    public static void main(String[] args) {

        Text text = new PlainText("Hello World!");

        text = new BoldText(text);
        System.out.println(text.render());

        text = new ItalicText(text);
        System.out.println(text.render());

        text = new MarkText(text);
        System.out.println(text.render());
    }
}
