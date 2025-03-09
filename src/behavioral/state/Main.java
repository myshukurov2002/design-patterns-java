package behavioral.state;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        for (int i = 0; i < 6; i++) {
            trafficLight.changeLight();
        }
    }
}
