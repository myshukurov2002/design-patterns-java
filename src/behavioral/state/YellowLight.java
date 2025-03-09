package behavioral.state;

public class YellowLight implements TrafficLightState{
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("🟡 Sariq chiroq: Tayyorlaning...");
        trafficLight.setState(new GreenLight());
    }
}
