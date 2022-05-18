package solid_5_dip.problem;

import solid_5_dip.problem.dao.DaoProduct;
import solid_5_dip.problem.dao.DaoUser;
import solid_5_dip.problem.entity.Product;
import solid_5_dip.problem.entity.User;

public class EcommerceApp {

  public static void main(String[] args) {

    //PROBLEMA:
    // ALTO ACOPLAMENTO
    //
    // Para trocar, MySql por Oracle, deverei
    // A) Alterar a heranca em DaoUser
    // B) Alterar a heranca em DaoProduct
    //    OBS: Viola o SOLID 02
    //  *) A HERANCA nao guia AUTOMATICAMENTE p/ a implementacao(MySql ou Oracle) correta

    DaoUser repoUser = new DaoUser();
    User user = new User("paulo");
    repoUser.AddUser(user);

    DaoProduct repoProduct = new DaoProduct();
    Product product = new Product("ventilador");
    repoProduct.AddProduct(product);

  }
}