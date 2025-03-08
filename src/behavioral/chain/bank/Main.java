package behavioral.chain.bank;

public class Main {
    public static void main(String[] args) {
        LoanApprover chain = ChainLoanApprover.chain();
        chain.processLimit(10000);
    }
}
