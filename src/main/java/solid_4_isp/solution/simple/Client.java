package solid_4_isp.solution.simple;

import solid_4_isp.solution.simple.interfaces.AddClient;
import solid_4_isp.solution.simple.interfaces.ListItems;

public class Client implements ListItems, AddClient {

    // SOLUTION: SOLID 4 - ISP
    // Client is using the method/behaviour 'addClient'/'ListAll'
    // 'addClient'/'ListAll' are behaviours of the Client-Class
    // Client is taking only his corrects 'responsabilities/'behaviours'.
    public void addClient()
    {
        //  NICE! -> RIGHT CLASS 
    }

    public void ListAll()
    {
        //  NICE! -> RIGHT CLASS 
    }

}