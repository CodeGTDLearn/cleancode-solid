package solid_5_dip.problem.dao;

import solid_5_dip.problem.db_connections.MySql;
import solid_5_dip.problem.entity.User;

public class DaoUser extends MySql {

  // Para usar o ORACLE nesta classe, terei que:
  //   *) TROCAR HERANCA(alterar) de MYSQL p/ ORACLE
  //   *) Alteracoes ferem o SOLID Princ.02: OpenClose (Aberto p/ extensao, fechado p/ alteracoes)


  public void AddUser(User user) {
    super.ConnectDB();
    System.out.println("User added: " + user.getName() + " - repo1");
  }

}