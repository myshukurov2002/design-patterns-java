package behavioral.bridge.printer;

public class Main {
    public static void main(String[] args) {

        Printer blackInkjet = new InkjetPrinter(new BlackInk());
        Printer coloredInjet = new InkjetPrinter(new ColoredInk());

        blackInkjet.print();
        coloredInjet.print();

        Printer coloredLaser = new LaserPrinter(new ColoredInk());
        coloredLaser.print();
    }
}