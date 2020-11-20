package princ_2_ocp.solution;

public class WithdrawInvest extends AbstractWithdraw{

    @Override
    public void WithDraw(Integer transaction)
    {
        System.out.println("\nWithdrawing in Invest account:" + transaction + "\n");
    }
    

}
