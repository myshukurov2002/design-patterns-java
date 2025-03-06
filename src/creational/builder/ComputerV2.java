package creational.builder;

public class ComputerV2 {
    private String RAM;
    private String HDD;
    private boolean hasGPU;

    public ComputerV2(ComputerBuilder builder) {
        this.RAM = builder.RAM;
        this.HDD = builder.HDD;
        this.hasGPU = builder.hasGPU;
    }

    public static class ComputerBuilder{
        private String RAM;
        private String HDD;
        private boolean hasGPU;

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setHasGPU(boolean hasGPU) {
            this.hasGPU = hasGPU;
            return this;
        }

        public ComputerV2 build() {
            return new ComputerV2(this);
        }


    }

    @Override
    public String toString() {
        return "ComputerV2{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", hasGPU=" + hasGPU +
                '}';
    }
}
