package structural.adapter.port;

public class USBToTypeCAdapter implements TypeCPort{

    private USBPort usbPort;

    public USBToTypeCAdapter(USBPort usbPort) {
        this.usbPort = usbPort;
    }

    @Override
    public void connectTypeC() {
        System.out.println("Port is working ..");
        usbPort.connectUSB();
    }
}
