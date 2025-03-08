package behavioral.fackade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void startComputer() {
        System.out.println("Komyuter ishga tushmoqda");
        cpu.start();
        memory.load();
        hardDrive.read();
        System.out.println("Komyuter ishga tushti");
    }

    public void stopComputer() {
        System.out.println("Komyuter uchirilmoqda");
        memory.fee();
        hardDrive.stop();
        cpu.shutdown();
        System.out.println("Komyuter uchirildi");
    }
}
