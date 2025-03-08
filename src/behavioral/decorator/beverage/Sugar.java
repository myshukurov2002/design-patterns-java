package behavioral.decorator.beverage;

public class Sugar extends CoffeeDecorator{

    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Sugar";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5;
    }

    @Override
    public void getDetails() {
        System.out.println(super.getDescription() + " Sugar" + " " + (super.getCost() + 0.5));
    }
}
