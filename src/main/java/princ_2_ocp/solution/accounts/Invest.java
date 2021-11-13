package princ_2_ocp.solution.accounts;

public class Invest extends WithdrawAbstraction {

    @Override
    public void withDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Invest account:" + transaction + "\n");
    }
    

}