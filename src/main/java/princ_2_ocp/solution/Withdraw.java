package princ_2_ocp.solution;

public class Withdraw {

    public static void main(String[] args)
    {
        AbstractWithdraw checking = new WithdrawChecking();
        checking.WithDraw(111);
        
        AbstractWithdraw savings = new WithdrawSavings();
        savings.WithDraw(222);

        AbstractWithdraw invest = new WithdrawInvest();
        invest.WithDraw(222);
    }
}
