package princ_2_ocp.solution.accounts;

public class Tfsa extends WithdrawAbstraction {

    @Override
    public void withDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in TFSA account:" + transaction + "\n");
    }
    

}