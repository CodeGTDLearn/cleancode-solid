package solid_2_ocp.solution.simple.accounts;

public class Savings extends WithdrawTypeAbstraction {

    @Override
    public void withDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Savings account:" + transaction + "\n");
    }
    

}