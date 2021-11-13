package princ_3_lkv.solution_final;

public class AreaCalculatorApp {

    // PRINCIPIO 03: LISKOV
    // Derived classes must be substitutable for their base classes.
    // Os subtipos devem ser substituíveis pelos seus tipos base
    public static void main(String[] args)
    {
        /**
         * This Rectangle  is using its own behaviour
         *
         * LISKOV PRESERVED!!!      
         */
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(5);
        rectangle.setWidth(2);

        System.out.println("Area - Rectangle: " + rectangle.AreaBehaviour());

        /**
         * This Square is using its own behaviour
         *
         * LISKOV PRESERVED!!!    
         */
        Square square = new Square();
        square.setSide(5);

        System.out.println("Area - Square: " + square.AreaBehaviour());

    }
}