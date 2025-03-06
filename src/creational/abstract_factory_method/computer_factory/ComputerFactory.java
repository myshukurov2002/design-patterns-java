package creational.abstract_factory_method.computer_factory;

public interface ComputerFactory {
    Processor createProcessor();
    Monitor createMonitor();
}
