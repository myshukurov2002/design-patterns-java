package structural.bridge.printer;

public abstract class Printer {

    protected Ink ink;

    public Printer(Ink ink) {
        this.ink = ink;
    }

    public abstract void print();
}
