package solid_4_isp.solution.advanced;


import solid_4_isp.solution.advanced.interfaces.Product_I;
import solid_4_isp.solution.advanced.interfaces.General_I;

public class Product implements Product_I {

    // SOLUTION: SOLID 4 - ISP
    // Product is using the method/behaviour 'addProduct'/'ListAll'
    // 'addProduct'/'ListAll' are behaviours of the Product-Class
    // Product is taking only his corrects 'responsabilities/'behaviours'.
    public void addProduct()
    {
        //  NICE! -> RIGHT CLASS 
    }

    public void ListAll()
    {
        //  NICE! -> RIGHT CLASS 
    }

}