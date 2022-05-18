package solid_2_ocp.solution.using_dip.accounts;

public class Savings implements WithdrawI {

    @Override
    public void withDraw(Integer numTransaction)
    {
        System.out.println("\nWithdrawing in Savings account:" + numTransaction + "\n");
    }
    

}