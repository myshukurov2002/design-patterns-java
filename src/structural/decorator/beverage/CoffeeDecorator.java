package structural.decorator.beverage;

public abstract class CoffeeDecorator implements Beverage {

    protected Beverage beverage;

    public CoffeeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double getCost() {
        return beverage.getCost();
    }
}
