package solid_2_ocp.solution.using_dip.accounts;

public class Tfsa implements WithdrawI {

  @Override
  public void withDraw(Integer numTransaction) {

    System.out.println("\nWithdrawing in TFSA account:" + numTransaction + "\n");

  }


}