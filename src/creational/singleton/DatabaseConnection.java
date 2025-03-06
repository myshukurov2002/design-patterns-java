package creational.singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance;

    public static DatabaseConnection connection() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void test() {
        System.out.println("successfully connected!!");
    }

    public void disconnect() {
        instance = null;
    }
}
