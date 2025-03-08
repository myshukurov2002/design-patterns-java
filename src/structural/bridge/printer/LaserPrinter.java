package structural.bridge.printer;

public class LaserPrinter extends Printer{

    public LaserPrinter(Ink ink) {
        super(ink);
    }

    @Override
    public void print() {
        System.out.println("Laser " + super.ink.color());
    }
}
