package princ_2_ocp.problem;

public class WithdrawSystem {

    int transactNumber = 0;

    public void WithDraw(double amount, String acctNumber, WithdrawTypeAccounts withdrawTypeAccounts)
    {

        switch (withdrawTypeAccounts) {
            
            case CHECKING:

                this.transactNumber = 1;
                System.out.println("WithDraw from Checking " + this.transactNumber);
                break;

            case SAVINGS:
                
                this.transactNumber = 1;
                System.out.println("WithDraw from Savings " + this.transactNumber);
                break;

            case INVEST:

                this.transactNumber = 1;
                System.out.println("WithDraw from Invest " + this.transactNumber);
                break;

        }

    }

}
