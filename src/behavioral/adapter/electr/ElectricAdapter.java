package behavioral.adapter.electr;

public class ElectricAdapter implements NewElectrSystem{

    private OldElectricSystem oldElectricSystem;

    public ElectricAdapter(OldElectricSystem oldElectricSystem) {
        this.oldElectricSystem = oldElectricSystem;
    }

    @Override
    public void connect220V() {
        System.out.println("Adapter is working ..");
        oldElectricSystem.connect110V();
    }
}
