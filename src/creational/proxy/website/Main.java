package creational.proxy.website;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet("mazgi.com");
        internet.connect();
    }
}
