package behavioral.template;

public class Main {
    public static void main(String[] args) {
        System.out.println("☕ Qahva tayyorlash:");
        Beverage coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n🍵 Choy tayyorlash:");
        Beverage tea = new Tea();
        tea.prepareRecipe();
    }
}
