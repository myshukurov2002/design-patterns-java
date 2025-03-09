package behavioral.observer;

public class LaptopDisplay implements Observer {

    private final String name;

    public LaptopDisplay(String name) {
        this.name = name;
    }

    @Override
    public void update(float temperature) {
        System.out.println("[PHONE] " + name + " : " + temperature);
    }
}
