package princ_3_lkv.problem;

public class SquareChild extends RectangleParent {

    private double side = 0;

    @Override
    public double areaBehaviourRectangle()
    {
        super.setLength(this.side);
        super.setWidth(this.side);

        return super.areaBehaviourRectangle();
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    //NOTICE:    
    //GETTERS ARE NOT NECESSARY IN THIS EXAMPLE,
    //THATS WHY, WE DO NOT HAVE THEM HERE.
}
