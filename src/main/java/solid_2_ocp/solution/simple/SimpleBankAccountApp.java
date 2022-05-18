package solid_2_ocp.solution.simple;

import solid_2_ocp.solution.simple.accounts.*;

public class SimpleBankAccountApp {

  public static void main(String[] args) {

    // SOLUTION: SOLID 2 - OCP
    // same abstraction, different behaviours
    // each new behaviour/class/feature created/added
    // will implement/concretize the abstraction-behaviour
    // and using 'WithdrawI' will implement/concretize its own new-behaviour
    // without change anything, in any previous classes
    // hence: the App is Opened for extensions/addings, but closed for modifications/changes
    WithdrawTypeAbstraction savingsAccount = new Savings();
    savingsAccount.withDraw(111);


    WithdrawTypeAbstraction tfsaAccount = new Tfsa();
    tfsaAccount.withDraw(111);


  }
}