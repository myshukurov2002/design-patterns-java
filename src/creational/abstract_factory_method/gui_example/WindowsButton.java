package creational.abstract_factory_method.gui_example;

public class WindowsButton implements Button{

    @Override
    public void click() {
        System.out.println("Windows Button Clicked");
    }
}
