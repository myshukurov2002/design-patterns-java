package behavioral.template;

public abstract class Beverage {

    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    private void boilWater() {
        System.out.println("Suv qaynayapti...");
    }

    private void pourInCup() {
        System.out.println("Ichimlik stakanga quyildi.");
    }

    protected abstract void brew();
    protected abstract void addCondiments();
}
