package behavioral.observer;

import java.util.LinkedList;
import java.util.List;

public class WeatherStation implements Subject{

    List<Observer> observers = new LinkedList<>();
    private float temperature;


    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
            observers
                    .forEach(o -> o.update(temperature));
    }
}
