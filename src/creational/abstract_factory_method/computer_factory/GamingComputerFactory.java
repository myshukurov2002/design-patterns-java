package creational.abstract_factory_method.computer_factory;

public class GamingComputerFactory implements ComputerFactory{
    @Override
    public Processor createProcessor() {
        return new IntelProcessor();
    }

    @Override
    public Monitor createMonitor() {
        return new LCDMonitor();
    }
}
