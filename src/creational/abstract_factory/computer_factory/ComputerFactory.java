package creational.abstract_factory.computer_factory;

public interface ComputerFactory {
    Processor createProcessor();
    Monitor createMonitor();
}
