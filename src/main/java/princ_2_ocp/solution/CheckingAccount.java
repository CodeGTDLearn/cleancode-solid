package princ_2_ocp.solution;

public class CheckingAccount extends AbstractWithdraw{

    @Override
    public void WithDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Checking account:" + transaction + "\n");
    }
    
}
