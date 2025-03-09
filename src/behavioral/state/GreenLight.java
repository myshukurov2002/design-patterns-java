package behavioral.state;

public class GreenLight implements TrafficLightState{
    @Override
    public void changeState(TrafficLight trafficLight) {
        System.out.println("🟢 Yashil chiroq: Yuring!");
        trafficLight.setState(new RedLight());
    }
}
