package behavioral.composite.employee;

import java.util.LinkedList;
import java.util.List;

public class CEO implements Employee{

    private String name;
    private String position;
    private List<Employee> subordinates = new LinkedList<>();

    public CEO(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public boolean addAll(List<Employee> employees) {
        return subordinates.addAll(employees);
    }

    public boolean addEmployee(Employee employee) {
        return subordinates.add(employee);
    }

    public boolean removeEmployee(Employee employee) {
        return subordinates.remove(employee);
    }


    @Override
    public void showDetails() {

        System.out.println("CEO:\n\tName: " + name + "\n\tPosition: " + position);
        subordinates
                .forEach(Employee::showDetails);
    }
}
