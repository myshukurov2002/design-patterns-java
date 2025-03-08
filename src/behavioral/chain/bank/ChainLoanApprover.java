package behavioral.chain.bank;

public class ChainLoanApprover {

    public static LoanApprover chain() {
        LoanApprover manager = new Manager();
        LoanApprover director = new Director();
        LoanApprover ceo = new CEO();
        manager.setNextLoanApprover(director);
        director.setNextLoanApprover(ceo);

        return manager;
    }
}
