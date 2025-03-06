package creational.builder;

public class Computer {
    private String RAM;
    private String HDD;
    private boolean hasGPU;

    public Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.hasGPU = builder.hasGPU;
    }

    public static class ComputerBuilder{
        private String RAM;
        private String HDD;
        private boolean hasGPU;

        public ComputerBuilder(String RAM, String HDD) {
            this.RAM = RAM;
            this.HDD = HDD;
        }

        public ComputerBuilder setGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }

    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", hasGPU=" + hasGPU +
                '}';
    }
}
