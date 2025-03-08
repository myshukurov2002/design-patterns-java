package behavioral.composite.employee;

import java.util.List;

public class Main {
    public static void main(String[] args) {
            CEO ceo = new CEO("Bekzod", "CEO");
            ceo.addEmployee(new Developer("Nur", "Developer"));
            ceo.addAll(List.of(
                    new Developer("Bunyod", "Developer"),
                    new Developer("Dilshod", "Developer"),
                    new Developer("Sobir", "Developer"),
                    new Developer("Shokir", "Developer")
            ));

            ceo.showDetails();
    }
}
