package solid_3_lsp.solution_final;

public class AreaCalculatorApp {

    // SOLUTION: SOLID 3 - LSP
    // Derived classes must be substitutable for their base classes.
    // Os subtipos devem ser substituíveis pelos seus tipos base
    public static void main(String[] args)
    {
        /**
         * This Rectangle  is using its own behaviour/calculation area
         * LISKOV PRESERVED!!!      
         */
        RectangleAreaCalculation rectangle = new RectangleAreaCalculation();
        rectangle.setLength(5);
        rectangle.setWidth(2);
        System.out.println("Area - Rectangle: " + rectangle.AreaBehaviour());

        /**
         * This Square is using its own behaviour/calculation area
         * LISKOV PRESERVED!!!    
         */
        SquareAreaCalculation square = new SquareAreaCalculation();
        square.setSide(5);
        System.out.println("Area - Square: " + square.AreaBehaviour());

    }
}