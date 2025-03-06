package creational.abstract_factory_method.computer_factory;

public class Main {
    public static void main(String[] args) {
        ComputerFactory gaming = new GamingComputerFactory();
        Monitor gamingMonitor = gaming.createMonitor();
        Processor gamingProcessor = gaming.createProcessor();

        ComputerFactory office = new OfficeComputerFactory();
        Monitor officeMonitor = office.createMonitor();
        Processor officeProcessor = office.createProcessor();

        gamingMonitor.show();
        gamingProcessor.type();


        officeMonitor.show();
        officeProcessor.type();
    }
}
