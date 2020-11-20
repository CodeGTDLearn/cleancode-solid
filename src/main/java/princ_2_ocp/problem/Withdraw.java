package princ_2_ocp.problem;

public class Withdraw {

    public static void main(String[] args) {

        WithdrawSystem debit = new WithdrawSystem();

        debit.WithDraw(1000.25,"1111",WithdrawTypeAccounts.SAVINGS);
        debit.WithDraw(1000.25,"1111",WithdrawTypeAccounts.CHECKING);
        debit.WithDraw(1000.25,"1111",WithdrawTypeAccounts.INVEST);

    }
}
