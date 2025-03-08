package structural.adapter.electr;

public class OldElectricAppliance implements OldElectricSystem{
    @Override
    public void connect110V() {
        System.out.println("110 Voltage");
    }
}
