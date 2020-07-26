package princ_3_lkv.solution_final;

public class AreaCalculator {

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
