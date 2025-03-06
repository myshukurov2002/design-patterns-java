package creational.abstract_factory.gui_example;

public class MacButton implements Button{
    @Override
    public void click() {
        System.out.println("Mac Button Clicked");
    }
}
