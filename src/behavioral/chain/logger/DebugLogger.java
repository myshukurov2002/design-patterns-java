package behavioral.chain.logger;

public class DebugLogger extends Logger{
    private int level;

    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("[DEBUG]:" + message);
    }
}
