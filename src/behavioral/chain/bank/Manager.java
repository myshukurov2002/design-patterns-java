package behavioral.chain.bank;

public class Manager extends LoanApprover{

    private double limit;

    public Manager() {
        limit = 5000D;
        approvalLimit = 5000D;
    }

    @Override
    public void approveLoan(double amount) {
        System.out.println("Menejer tomonidan tasdiqlandi: " + amount + "$");    }
}
