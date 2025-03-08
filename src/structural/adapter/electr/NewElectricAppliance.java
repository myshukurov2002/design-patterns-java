package structural.adapter.electr;

public class NewElectricAppliance implements NewElectrSystem{
    @Override
    public void connect220V() {
        System.out.println("220 Voltage");
    }
}
