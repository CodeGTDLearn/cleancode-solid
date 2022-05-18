package solid_2_ocp.problem;

public class WithdrawMoneyApp {

  public static void main(String[] args) {

    //PROBLEMA:
    // A cada nova modalidade de Account
    // Deverei:
    // A) Acrescenta-la (alterando) no "Enum Accounts"
    // B) Acrescenta-la (alterando)  no "Switch da classe WithdrawSystem"
    //    OBS: Viola o SOLID 02
    WithdrawSystem debit = new WithdrawSystem();

    debit.WithDraw("1111",Accounts.SAVINGS);

  }
}