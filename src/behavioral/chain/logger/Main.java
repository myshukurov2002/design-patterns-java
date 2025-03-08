package behavioral.chain.logger;

public class Main {
    public static void main(String[] args) {
        Logger loggerChain = ChainLogger.chain();

//        loggerChain.logMessage(1, "Bu oddiy xabar.");
//        loggerChain.logMessage(2, "Bu debug xabari.");
        loggerChain.logMessage(3, "Bu xato xabari!");
    }
}
