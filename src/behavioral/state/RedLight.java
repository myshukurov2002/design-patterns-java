package behavioral.state;

public class RedLight implements TrafficLightState{

    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("🔴 Qizil chiroq: To‘xtang!");
        trafficLight.setState(new YellowLight());
    }
}
