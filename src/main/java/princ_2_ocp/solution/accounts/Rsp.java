package princ_2_ocp.solution.accounts;

public class Rsp extends WithdrawAbstraction {
  public void withDraw(Integer numTransaction) {
    System.out.println("\nWithdrawing in RSP account:" + numTransaction + "\n");
  }
}