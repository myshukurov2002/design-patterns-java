package behavioral.template;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Choy damlanmoqda...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Choyga limon qo‘shildi.");
    }
}
