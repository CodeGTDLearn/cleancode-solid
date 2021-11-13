package princ_5_dip.problem.repo;

import princ_5_dip.problem.db.MySql;
import princ_5_dip.problem.entity.Product;

public class RepoProduct extends MySql {

  // Para usar o ORACLE nesta classe, terei que:
  //   *) TROCAR HERANCA(alterar) de MYSQL p/ ORACLE
  //   *) Alteracoes ferem o SOLID Princ.02: OpenClose (Aberto p/ extensao, fechado p/ alteracoes)


  public void AddProduct(Product product) {
    super.ConnectDB();
    System.out.println("Product added: " + product.getName() + " - repo2");
  }

}