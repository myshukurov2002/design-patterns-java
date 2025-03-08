package structural.composite.employee;

public class Developer implements Employee {

    private String name;
    private String position;

    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void showDetails() {
        System.out.println("Developer:\n\tName: " + name + "\n\tPosition: " + position);
    }
}
