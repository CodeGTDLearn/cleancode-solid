package solid_5_dip.solucao.dao;

import solid_5_dip.solucao.db_connections.Connection_I;
import solid_5_dip.solucao.entity.Product;

public class DaoProduct {

    private final Connection_I connection;

    public DaoProduct(Connection_I injectedConnection)
    {
        this.connection = injectedConnection;
    }  

    public void AddProduct(Product product)
    {
        connection.ConnectDB();
        System.out.println("Product added: " + product.getName());
    }

}