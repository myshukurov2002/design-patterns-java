package creational.singleton;

public class SingleTonThreadSafe {

    private static SingleTonThreadSafe singleTonThreadSafe;

    public static SingleTonThreadSafe getInstance() {
        if (singleTonThreadSafe == null) {
            synchronized (SingleTonThreadSafe.class) {
                if (singleTonThreadSafe == null) {
                    singleTonThreadSafe = new SingleTonThreadSafe();
                }
            }
        }
        return singleTonThreadSafe;
    }
}
