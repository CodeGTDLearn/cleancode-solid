package princ_2_ocp.solution.accounts;

public class Checking extends WithdrawAbstraction {

    @Override
    public void withDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Checking account:" + transaction + "\n");
    }
    
}