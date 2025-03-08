package behavioral.chain.logger;

public class ChainLogger {

    public static Logger chain() {
        Logger error = new ErrorLogger(1);
        Logger debug = new DebugLogger(2);
        Logger info = new InfoLogger(3);
        error.setNextLogger(debug);
        debug.setNextLogger(info);

        return error;
    }
}
