package behavioral.observer;

public class PhoneDisplay implements Observer{

    private final String name;

    public PhoneDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println("[PHONE] " + name + " : " + temperature);
    }
}
