package solid_4_isp.solution.simple;


import solid_4_isp.solution.simple.interfaces.AddProduct;
import solid_4_isp.solution.simple.interfaces.ListItems;

public class Product implements ListItems, AddProduct {

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