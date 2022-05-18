package solid_2_ocp.solution.simple.accounts;

public class Checking extends WithdrawTypeAbstraction {

    @Override
    public void withDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Checking account:" + transaction + "\n");
    }
    
}