package solid_2_ocp.solution.using_dip;

import solid_2_ocp.solution.using_dip.accounts.Savings;
import solid_2_ocp.solution.using_dip.accounts.Tfsa;
import solid_2_ocp.solution.using_dip.accounts.WithdrawI;

public class DipBankAccountApp {

  public static void main(String[] args) {
    // SOLUTION: SOLID 2 - OCP
    // same abstraction, different behaviours
    // each new behaviour/class/feature created/added
    // will implement/concretize the abstraction-behaviour
    // and using 'WithdrawI' will implement/concretize its own new-behaviour
    // without change anything, in any previous classes
    // hence: the App is Opened for extensions/addings, but closed for modifications/changes
    WithdrawI savingsAccount = new Savings();
    savingsAccount.withDraw(111);

    WithdrawI tfsaAccount = new Tfsa();
    tfsaAccount.withDraw(111);


  }
}