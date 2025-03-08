package behavioral.chain.bank;

public abstract class LoanApprover {

    protected LoanApprover nextLoanApprover;
    protected double approvalLimit;

    public void setNextLoanApprover(LoanApprover nextLoanApprover) {
        this.nextLoanApprover = nextLoanApprover;
    }

    public void processLimit(double amount) {
        if (approvalLimit >= amount) {
            approveLoan(amount);
        } else if (nextLoanApprover != null) {
            nextLoanApprover.processLimit(amount);
        } else {
            System.out.println("So'rov Rad Etildi!");
        }
    }

    public abstract void approveLoan(double amount);
}
