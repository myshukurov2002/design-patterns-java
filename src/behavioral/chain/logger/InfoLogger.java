package behavioral.chain.logger;

public class InfoLogger extends Logger {

    private int level;

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("[INFO]:" + message);
    }
}
