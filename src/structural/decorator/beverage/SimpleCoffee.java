package structural.decorator.beverage;

public class SimpleCoffee implements Beverage{

    private String description;
    private double cost;

    public SimpleCoffee(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }


    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void getDetails() {
        System.out.println(description + " " + cost);
    }
}
