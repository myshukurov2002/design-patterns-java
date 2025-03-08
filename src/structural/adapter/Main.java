package structural.adapter;

import structural.adapter.electr.ElectricAdapter;
import structural.adapter.electr.OldElectricAppliance;
import structural.adapter.port.USBPortImpl;
import structural.adapter.port.USBToTypeCAdapter;

public class Main {
    public static void main(String[] args) {
        ElectricAdapter electricAdapter =
                new ElectricAdapter(new OldElectricAppliance());
        electricAdapter.connect220V();

        USBToTypeCAdapter adapter = new USBToTypeCAdapter(new USBPortImpl());
        adapter.connectTypeC();


    }
}
