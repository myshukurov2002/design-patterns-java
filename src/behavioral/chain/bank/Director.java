package behavioral.chain.bank;

public class Director extends LoanApprover {
    private double limit;

    public Director() {
        limit = 20000D;
        approvalLimit = 20000D;
    }

    @Override
    public void approveLoan(double amount) {
        System.out.println("Director tomonidan tasdiqlandi: " + amount + "$");
    }
}
