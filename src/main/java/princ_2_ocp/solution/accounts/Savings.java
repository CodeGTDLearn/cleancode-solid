package princ_2_ocp.solution.accounts;

public class Savings extends WithdrawAbstraction {

    @Override
    public void withDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Savings account:" + transaction + "\n");
    }
    

}