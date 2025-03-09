package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        Observer phone1 = new PhoneDisplay("Ali telefoni");
        Observer phone2 = new PhoneDisplay("Madina telefoni");
        Observer laptop = new LaptopDisplay("Oybek");

        weatherStation.addObserver(phone1);
        weatherStation.addObserver(phone2);
        weatherStation.addObserver(laptop);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);
    }
}
