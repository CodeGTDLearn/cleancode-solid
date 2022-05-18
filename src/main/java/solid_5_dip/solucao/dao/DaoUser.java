package solid_5_dip.solucao.dao;

import solid_5_dip.solucao.db_connections.Connection_I;
import solid_5_dip.solucao.entity.User;

public class DaoUser {
    
    private final Connection_I connection;
    
    public DaoUser(Connection_I injectedConnection)
    {
        this.connection = injectedConnection;
    }  

    public void AddUser(User user)
    {
        connection.ConnectDB();
        System.out.println("User added: " + user.getName());
    }

}