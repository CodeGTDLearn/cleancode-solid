package solid_2_ocp.solution.simple.accounts;

public class Invest extends WithdrawTypeAbstraction {

    @Override
    public void withDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Invest account:" + transaction + "\n");
    }
    

}