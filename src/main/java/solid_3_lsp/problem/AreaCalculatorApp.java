package solid_3_lsp.problem;

public class AreaCalculatorApp {

    public static void main(String[] args)
    {
        // PROBLEMA:
        // LISKOV PRESERVED!!! Rectangle are has Length x Width
        RectangleParent rectangle = new RectangleParent();
        rectangle.setLength(5);
        rectangle.setWidth(2);
        System.out.println("Area - Rectangle: " + rectangle.areaBehaviourRectangle());

        // LISKOV VIOLATION!!!
        // Square is using/improvising a "Parent Method"(areaBehaviourRectangle) and
        // changing its behaviour to find the SquareArea
        SquareChild square = new SquareChild();
        square.setSide(5);
        System.out.println("Area - Square: " + square.areaBehaviourRectangle());

    }
}