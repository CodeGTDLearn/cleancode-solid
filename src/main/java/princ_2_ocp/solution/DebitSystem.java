package princ_2_ocp.solution;

public class DebitSystem {

    public static void main(String[] args)
    {
        AbstractWithdraw checking = new CheckingAccount();
        checking.WithDraw(111);
        
        AbstractWithdraw savings = new SavingsAccount();
        savings.WithDraw(222);       
    }
}
