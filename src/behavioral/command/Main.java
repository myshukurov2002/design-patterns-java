package behavioral.command;

public class Main {
    public static void main(String[] args) {

        Tv tv = new Tv();
        TurnOn turnOn = new TurnOn(tv);
        TurnOff turnOff = new TurnOff(tv);
        RemoteController remote = new RemoteController();

        remote.setCommand(turnOn);
        remote.pressButton();

        remote.setCommand(turnOff);
        remote.pressButton();


    }
}
