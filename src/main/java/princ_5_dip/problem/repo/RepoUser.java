package princ_5_dip.problem.repo;

import princ_5_dip.problem.db.MySql;
import princ_5_dip.problem.entity.User;

public class RepoUser extends MySql {

  // Para usar o ORACLE nesta classe, terei que:
  //   *) TROCAR HERANCA(alterar) de MYSQL p/ ORACLE
  //   *) Alteracoes ferem o SOLID Princ.02: OpenClose (Aberto p/ extensao, fechado p/ alteracoes)


  public void AddUser(User user) {
    super.ConnectDB();
    System.out.println("User added: " + user.getName() + " - repo1");
  }

}