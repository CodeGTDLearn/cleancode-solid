package princ_3_lkv.solution_dilemma;

public class Square {

    private double side = 0;

    public double area()
    {
        /**
         * FIRSTLY -->> THERE IS NO SOLUTION!!!
         *
         * The RECTANGLE-PARENT and SQUARE-CHILD has different 'Area Behaviours'
         *
         * SQUARE cannot inherit RECTANGLE to use the 'Area Behaviour'(method)
         * WITHOUT BROKEN LISKOV PRINCIPLE
         *
         * SECONDLY -->> Can we apply the PRINC_2_OCP, to solve this problem???
         *
         */

        return 0.00;
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    //NOTICE:    
    //GETTERS ARE NOT NECESSARY IN THIS EXAMPLE,
    //THATS WHY, WE DO NOT HAVE THEM HERE.
}
