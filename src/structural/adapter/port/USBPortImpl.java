package structural.adapter.port;

public class USBPortImpl implements USBPort{

    @Override
    public void connectUSB() {
        System.out.println("USB Port");
    }
}
