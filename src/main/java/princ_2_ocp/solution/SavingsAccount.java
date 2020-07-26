package princ_2_ocp.solution;

public class SavingsAccount extends AbstractWithdraw{

    @Override
    public void WithDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Savings account:" + transaction + "\n");
    }
    

}
