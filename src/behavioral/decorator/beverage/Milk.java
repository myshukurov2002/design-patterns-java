package behavioral.decorator.beverage;

public class Milk extends CoffeeDecorator{

    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Milk";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1.5;
    }

    @Override
    public void getDetails() {
        System.out.println(super.getDescription() + " Sugar" + " " + (super.getCost() + 1.5));
    }
}
