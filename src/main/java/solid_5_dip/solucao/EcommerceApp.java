package solid_5_dip.solucao;


import solid_5_dip.solucao.dao.DaoProduct;
import solid_5_dip.solucao.dao.DaoUser;
import solid_5_dip.solucao.db_connections.Connection_I;
import solid_5_dip.solucao.db_connections.MySqlConnection;
import solid_5_dip.solucao.entity.Product;
import solid_5_dip.solucao.entity.User;

public class EcommerceApp {

  public static void main(String[] args) {

    // SOLUTION: SOLID 5 - DIP
    // Para trocar, MySql por Oracle nas REPO's
    // Basta:
    // A) Criar a classe de DB 'OracleConnection', implementando a "Connection_I"
    //    OBS1: Nenhuma alteracao sera feita (preserva o SOLID 02 - OCP)
    //    OBS2: Todas as Dao's 'AUTOMATICAMENTE' se guiaram p/ OracleConnection (via injecao)

    // 01) GERA DEPENDENCIA "FORA" DA CLASSE:
    // As classes 'DaoUser' e 'DaoProduct' necessitam da 'Connection'
    // Mas connection esta sendo criada fora dessas 2 classes baseando-se em Connection_I
    // 'DaoUser' e 'DaoProduct' estao recebendo suas 'Connections' via a Connection_I
    // logo, todas as connections() ligadas a 'Connection_I' podem ser injetadas
    // em qquer classe que receba 'Connections' via a Connection_I
    // que e justamente o caso de 'DaoUser' e 'DaoProduct'


    // Connection_I redisConnection = new RedisConnection();
    // Connection_I oracleConnection = new OracleConnection();
    Connection_I mySqlConnection = new MySqlConnection();

    // CLIENT:
    // a) INJETA 'DEPENDENCIA' NA 'CLASSE-DEPENDENTE'(DaoUser)
    DaoUser daoUser = new DaoUser(mySqlConnection);

    // b) 'CLASSE-DEPENDENTE' funcionando com a DEPENDECIA-INJETADA(mySqlConnection)
    daoUser.AddUser(
         new User("User: paulo - " + mySqlConnection.getClass()
                                                    .getSimpleName()));

    // PRODUCT:
    // a) INJETA 'DEPENDENCIA' NA 'CLASSE-DEPENDENTE'(DaoProduct)
    DaoProduct daoProduct = new DaoProduct(mySqlConnection);

    // b) 'CLASSE-DEPENDENTE' funcionando com a DEPENDECIA-INJETADA(mySqlConnection)
    daoProduct.AddProduct(
         new Product("Product: ventilador - " +
                          mySqlConnection.getClass()
                                         .getSimpleName()));
  }
}