package princ_5_dip.problem;

import princ_5_dip.problem.entity.Product;
import princ_5_dip.problem.entity.User;
import princ_5_dip.problem.repo.RepoUser;
import princ_5_dip.problem.repo.RepoProduct;

public class ManageUsersApp {

    public static void main(String[] args)
    {

        //PROBLEMA:
        // ALTO ACOPLAMENTO
        //
        // Para trocar, MySql por Oracle, deverei
        // A) Alterar a heranca em RepoUser
        // B) Alterar a heranca em RepoProduct
        //    OBS: Viola o SOLID 02
        //  *) A HERANCA nao guia AUTOMATICAMENTE p/ a implementacao(MySql ou Oracle) correta

        RepoUser repoUser = new RepoUser();
        User user = new User("paulo");
        repoUser.AddUser(user);

        RepoProduct repoProduct = new RepoProduct();
        Product product = new Product("ventilador");
        repoProduct.AddProduct(product);

    }
}