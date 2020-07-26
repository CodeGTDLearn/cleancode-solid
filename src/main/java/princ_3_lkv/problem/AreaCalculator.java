package princ_3_lkv.problem;

public class AreaCalculator {

    public static void main(String[] args)
    {
        /**
         * This Rectangle is following the correct standard
         *
         * LISKOV PRESERVED!!!      
         */
        RectangleParent rectangle = new RectangleParent();
        rectangle.setLength(5);
        rectangle.setWidth(2);

        System.out.println("Area - Rectangle: " + rectangle.areaBehaviourRectangle());

        /**
         * This Square is using a "Parent Method" and changing its behaviour
         *
         * LISKOV BROKEN!!!
         */
        SquareChild square = new SquareChild();
        square.setSide(5);

        System.out.println("Area - Square: " + square.areaBehaviourRectangle());

    }
}
