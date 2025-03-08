package creational.proxy.website;

public class ProxyInternet implements Internet{

    private RealInternet realInternet;
    private String url;

    public ProxyInternet(String url) {
        realInternet = new RealInternet(url);
        this.url = url;
    }

    @Override
    public void connect() {
        realInternet.connect();
    }
}
