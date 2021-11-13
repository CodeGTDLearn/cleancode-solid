package princ_5_dip.solucao;


import princ_5_dip.solucao.db.IDbAbstraction;
import princ_5_dip.solucao.db.Redis;
import princ_5_dip.solucao.entity.Product;
import princ_5_dip.solucao.entity.User;
import princ_5_dip.solucao.repo.RepoUser;
import princ_5_dip.solucao.repo.RepoProduct;

public class ManageUsersApp {

  public static void main(String[] args) {
    // https://mari-azevedo.medium.com/princ%C3%ADpios-s-o-l-i-d-o-que-s%C3%A3o-e-porque-projetos-devem-utiliz%C3%A1-los-bf496b82b299

    // PRINCIPIO 05: DEPENDENCY INJECTION
    // Depend on abstractions, not on concretions.
    // “dependa de abstrações e não de classes concretas”
    // - “Módulos de alto nível não devem depender de módulos de baixo nível.”
    // - “As abstrações não devem depender de detalhes. Os detalhes devem depender das abstrações.”
    // SOLUCAO:

    // Para trocar, MySql por Oracle nas REPO's
    // precisarei executar as seguintes etapas:
    // A) Criar a classe de DB 'Oracle', implementando a interface "Dao"
    //    OBS1: Nenhuma alteracao sera feita (preserva o SOLID 02)
    //    OBS2: Todas as REPOs 'AUTOMATICAMENTE' se guiaram p/ ORACLE (via injecao)

    // FINAL:
    // * VANTAGEM:
    //     QUERENDO TROCAR AS IMPLEMENTACOES, FARA SIMULTANEAMENTE, NOS MODULOS QUE A INJETARAM
    //     ==> TROCA-SE A DEPENDENCIA NO CONSTRUTOR, NAO PRECISA ABRIR/ALTERAR O MODULO/CLASSE
    //     ==> NAO MODIFICA A CLASSE QUE USA A DEPENDENCIA
    // * DESVANTAGEM:
    //     NAO PERMITE DIFERENTES IMPLEMENTACOES, EM DIFERENTES MODULOS DO 'APP'

    // APLICACAO DO CONCEITO EM DIFERENTES LOCAIS/MODULOS/CLASSES - 03 MOVIMENTOS:

    // 01) GERA DEPENDENCIA "FORA" DA CLASSE:
    IDbAbstraction db = new Redis();

    // MODULO 01 - REPO USER:
    // 02) INJETA DEPENDENCIA
    RepoUser repoUser = new RepoUser(db);

    // 03) USA CLASSE INJETADA
    repoUser.AddUser(new User("User: paulo - " +
                                   db.getClass()
                                     .getSimpleName()));

    // MODULO 02 - REPO PRODUCT:
    // 02) INJETA DEPENDENCIA
    RepoProduct repoProduct = new RepoProduct(db);

    // 03) USA CLASSE INJETADA
    repoProduct.AddProduct(new Product("Product: ventilador - " +
                                            db.getClass()
                                              .getSimpleName()));
  }
}