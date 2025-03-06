package creational.abstract_factory.gui_example;

public class WindowsCheckbox implements CheckBox{
    @Override
    public void check() {
        System.out.println("windows check");
    }
}
