package behavioral.bridge.printer;

public class InkjetPrinter extends Printer{
    public InkjetPrinter(Ink ink) {
        super(ink);
    }

    @Override
    public void print() {
        System.out.println("Injet " + ink.color());
    }
}
