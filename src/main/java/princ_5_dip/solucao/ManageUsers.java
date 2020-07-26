package princ_5_dip.solucao;


public class ManageUsers {

    public static void main(String[] args) {

        // SOLUCAO:

        // A classe REPO baseaia-se em MYSQL, p/ mudar p/ ORACLE(ou outros), terei que:
        //
        // a) Criar um nova classe 'Db' com o "MESMO NOME DA ANTERIOR" (deleta ou guarda a anterior)
        // b) Nela implementar a interface 'Db_Int', que guiara a implementacao correta
        // c) SOLID Princ.02 [OK]: OpenClose - Sem alteracoes - Somente acrescentou uma nova classe
        // d) Todas as REPOs, receberao 'AUTOMATICAMENTE' o ORACLE(novo DB) via injecao de dependencia
        //    feita na classe [ManagerUsers()]

        Db_Int dbInj1 = new Db1(); //Gera dependencia(Db1), externamente as REPOs
        Repo1 repo1 = new Repo1(dbInj1); //Injeta dependencia 'Db1', nas REPOs, via construtor
        Repo2 repo2 = new Repo2(dbInj1); //Injeta dependencia 'Db1', nas REPOs, via construtor

        Db_Int dbInj2 = new Db2(); //Gera dependencia, externamente aas REPOs
        Repo3 repo3 = new Repo3(dbInj2); //Injeta dependencia 'Db2', nas REPOs, via construtor
        Repo4 repo4 = new Repo4(dbInj2); //Injeta dependencia 'Db2', nas REPOs, via construtor

        repo1.AddUser(new User("paulo - repo1"));
        repo2.AddUser(new User("paulo - repo2"));
        repo3.AddUser(new User("paulo - repo3"));
        repo4.AddUser(new User("paulo - repo4"));
    }
}