package creational.singleton;

public class Main {
    public static Logger logger = Logger.getInstance();

    public static void main(String[] args) {

        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon2 = SingleTon.getInstance();

        System.out.println(singleTon == singleTon2);
        System.out.println(singleTon.hashCode() == singleTon2.hashCode());

        logger.log("salom");
        logger.log("mazgi");

        DatabaseConnection connection = DatabaseConnection.connection();
        connection.test();
        connection.disconnect();
        connection.test();

    }
}
