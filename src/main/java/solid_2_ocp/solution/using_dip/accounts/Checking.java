package solid_2_ocp.solution.using_dip.accounts;

public class Checking implements WithdrawI {

  @Override
  public void withDraw(Integer numTransaction) {

    System.out.println("\nWithdrawing in Checking account:" + numTransaction + "\n");
  }

}