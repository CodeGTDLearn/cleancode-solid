package solid_4_isp.problem;

public class Client implements AdditionListAbstractions {

    // PROBLEMA:
    // Client is being forced to use the method/behaviour 'addProduct'/'ListAll'
    // 'addProduct'/'ListAll' are behaviours of the Product-Class
    // Client is taking some 'responsabilities/'behaviours'('addProduct'/'ListAll') that not belong to it.
    public void addProduct()
    {
        //  PROBLEM >>> This method belong to another class 
    }

    public void addClient()
    {
        //  NICE! -> RIGHT CLASS  
    }

    public void ListAll()
    {
        //  NICE! -> RIGHT CLASS 
    }

}