package solid_2_ocp.solution.simple.accounts;

public class Rsp extends WithdrawTypeAbstraction {
  public void withDraw(Integer numTransaction) {
    System.out.println("\nWithdrawing in RSP account:" + numTransaction + "\n");
  }
}