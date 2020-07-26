package princ_2_ocp.problem;

public class DebitSystem {

    int transactNumber = 0;

    public void WithDraw(double amount, String acctNumber, TypeAccount typeAccount)
    {

        switch (typeAccount) {
            
            case CHECKING:

                this.transactNumber = 1;
                System.out.println("WithDraw from Checking " + this.transactNumber);
                break;

            case SAVINGS:
                
                this.transactNumber = 1;
                System.out.println("WithDraw from Savings " + this.transactNumber);
                break;

        }

    }

}
