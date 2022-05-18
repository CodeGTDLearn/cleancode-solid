package solid_2_ocp.solution.using_dip.accounts;

public class Rsp implements WithdrawI {
  @Override
  public void withDraw(Integer numTransaction) {

    System.out.println("\nWithdrawing in RSP account:" + numTransaction + "\n");
  }
}