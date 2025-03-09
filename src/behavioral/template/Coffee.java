package behavioral.template;

public class Coffee extends Beverage{
        @Override
        protected void brew() {
            System.out.println("Qahva tayyorlanmoqda...");
        }

        @Override
        protected void addCondiments() {
            System.out.println("Qahvaga sut va shakar qo‘shildi.");
        }
}
