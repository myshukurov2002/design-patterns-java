package structural.decorator.beverage;

public class Main {
    public static void main(String[] args) {

        Beverage coffee = new SimpleCoffee("Simple Coffe", 5);
        coffee.getDetails();

        coffee = new Sugar(coffee);
        coffee.getDetails();

        coffee = new Milk(coffee);
        coffee.getDetails();
    }
}
