package princ_3_lkv.problem;

public class RectangleParent {

    private double length = 0;
    private double width = 0;

    public double areaBehaviourRectangle()
    {
        return length * width;
    }

    public void setLength(double altura)
    {
        this.length = altura;
    }

    public void setWidth(double base)
    {
        this.width = base;
    }

    //NOTICE:    
    //GETTERS ARE NOT NECESSARY IN THIS EXAMPLE,
    //THATS WHY, WE DO NOT HAVE THEM HERE.
}
