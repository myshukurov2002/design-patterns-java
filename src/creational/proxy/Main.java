package creational.proxy;

public class Main {
    public static void main(String[] args) {
            Video video = new ProxyVideo("mazgi.mp4");
            video.play();
    }
}
