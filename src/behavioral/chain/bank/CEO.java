package behavioral.chain.bank;

public class CEO extends LoanApprover {
    private double limit;

    public CEO() {
        limit = 5000D;
        approvalLimit = 50000D;
    }

    @Override
    public void approveLoan(double amount) {
        System.out.println("CEO tomonidan tasdiqlandi: " + amount + "$");
    }
}