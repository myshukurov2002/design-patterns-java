package creational.proxy.website;

public class RealInternet implements Internet {

    private String url;

    public RealInternet(String url) {
        this.url = url;
        loadSource();
    }

    @Override
    public void connect() {
        System.out.println(this.url + " is connected..");
    }

    public void loadSource() {
        System.out.println(url + " Website Sources Are Loadind..");
    }
}
