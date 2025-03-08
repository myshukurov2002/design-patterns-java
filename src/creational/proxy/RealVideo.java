package creational.proxy;

public class RealVideo implements Video {

    private String fileName;

    public RealVideo(String fileName) {
        this.fileName = fileName;
        load();
    }

    public void load() {
        System.out.println(this.fileName + " is loading..");
    }

    @Override
    public void play() {
        System.out.println(fileName + " is playing..");
    }
}
