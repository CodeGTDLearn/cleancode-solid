package solid_2_ocp.solution.simple.accounts;

public class Tfsa extends WithdrawTypeAbstraction {

    @Override
    public void withDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in TFSA account:" + transaction + "\n");
    }
    

}