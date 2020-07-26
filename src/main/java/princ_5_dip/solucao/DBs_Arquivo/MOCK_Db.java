package princ_5_dip.solucao.DBs_Arquivo;


import princ_5_dip.solucao.Db_Int;

public class MOCK_Db implements Db_Int {

    public void ConnectDB()
    {
        System.out.println("\nConnected in MOCK-OBJECT");
    }

}
