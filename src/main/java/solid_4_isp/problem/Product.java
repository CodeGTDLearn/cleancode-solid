package solid_4_isp.problem;

public class Product implements AdditionListAbstractions {

    // PROBLEMA:
    // Product is being forced to use the method/behaviour 'addClient'
    // 'addClient' is a behaviour from Client-Class
    // Product is taking a 'responsability'/'behaviour'(addClient) that not belong to it.
    public void addClient()
    {
        //  PROBLEM >>> This method belong to another class       
    }

    public void addProduct()
    {
        //  NICE! -> RIGHT CLASS 
    }

    public void ListAll()
    {
        //  NICE! -> RIGHT CLASS 
    }

}