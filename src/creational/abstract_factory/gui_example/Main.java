package creational.abstract_factory.gui_example;

public class Main {
    public static void main(String[] args) {
        GUIFactory mac = new MacFactory();
        Button macButton = mac.createButton();
        CheckBox macCheckBox = mac.createCheckBox();
        macButton.click();
        macCheckBox.check();


        GUIFactory win = new WindowsFactory();
        Button winButton = win.createButton();
        CheckBox winCheckBox = win.createCheckBox();
        winButton.click();
        winCheckBox.check();
    }
}
