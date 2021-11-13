package princ_5_dip.solucao.repo;

import princ_5_dip.solucao.db.IDbAbstraction;
import princ_5_dip.solucao.entity.Product;

public class RepoProduct {

    private final IDbAbstraction repo;

    public RepoProduct(IDbAbstraction repo)
    {
        this.repo = repo;
    }  

    public void AddProduct(Product product)
    {
        repo.ConnectDB();
        System.out.println("Product added: " + product.getName());
    }

}