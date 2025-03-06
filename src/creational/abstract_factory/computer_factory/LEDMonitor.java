package creational.abstract_factory.computer_factory;

public class LEDMonitor implements Monitor{
    @Override
    public void show() {
        System.out.println("LED");
    }
}
