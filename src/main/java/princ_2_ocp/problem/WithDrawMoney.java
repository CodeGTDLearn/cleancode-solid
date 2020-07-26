package princ_2_ocp.problem;

public class WithDrawMoney {

    public static void main(String[] args)
    {

        DebitSystem debit = new DebitSystem();

        debit.WithDraw(1000.25, "1111", TypeAccount.SAVINGS);
        debit.WithDraw(1000.25, "1111", TypeAccount.CHECKING);

    }
}
