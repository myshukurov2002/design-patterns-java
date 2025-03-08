package creational.proxy;

public class ProxyVideo implements Video{

    private RealVideo realVideo;
    private String fileName;

    public ProxyVideo(String fileName) {
        this.fileName = fileName;
        realVideo = new RealVideo(fileName);
    }

    @Override
    public void play() {
        realVideo.play();
    }
}
