package princ_5_dip.problem;

public class ManageUsers {

    public static void main(String[] args)
    {
        User user = new User("paulo");

        //PROBLEMA:

        // A classe REPO baseaia-se em MYSQL. P/ mudar p/ ORACLE(ou outros), terei que:
        // a) Todas as 'REPOs' deverao ter as HERANCAS 'alteradas', de MYSQL p/ ORACLE
        //  *) A MERA HERANCA nao guiara a implementacao correta (Interface/Contrato guiaria)
        //  *) SOLID Princ.02 [OFENDIDO]: OpenClose (Aberto p/ extensao, fechado p/ alteracoes)

        Repo1 repo1 = new Repo1();
        Repo2 repo2 = new Repo2();

        repo1.AddUser(user);
        repo2.AddUser(user);

    }
}
