package princ_2_ocp.problem;

import static princ_2_ocp.problem.Accounts.*;

public class WithdrawSystem {


  public void WithDraw(String acctNumber,Accounts accounts) {

    switch (accounts) {
      case CHECKING:
        System.out.println("WithDrawing | TypeAccount:" + CHECKING + " | n: " + acctNumber);
        break;

      case SAVINGS:
        System.out.println("WithDrawing | TypeAccount:" + SAVINGS + " | n: " + acctNumber);
        break;

      case INVEST:
        System.out.println("WithDrawing | TypeAccount:" + INVEST + " | n: " + acctNumber);
        break;

    }

  }

}