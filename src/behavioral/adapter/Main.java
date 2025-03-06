package behavioral.adapter;

import behavioral.adapter.electr.ElectricAdapter;
import behavioral.adapter.electr.OldElectricAppliance;
import behavioral.adapter.port.USBPortImpl;
import behavioral.adapter.port.USBToTypeCAdapter;

public class Main {
    public static void main(String[] args) {
        ElectricAdapter electricAdapter =
                new ElectricAdapter(new OldElectricAppliance());
        electricAdapter.connect220V();

        USBToTypeCAdapter adapter = new USBToTypeCAdapter(new USBPortImpl());
        adapter.connectTypeC();
    }
}
