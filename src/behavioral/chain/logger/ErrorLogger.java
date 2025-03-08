package behavioral.chain.logger;

public class ErrorLogger extends Logger{

    private int level;

    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    public void write(String message) {
        System.out.println("[ERROR]:" + message);
    }
}
