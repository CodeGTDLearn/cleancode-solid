package princ_3_lkv.solution_final;

public class Rectangle extends AbstractAreaPolygon {

    private double length = 0;
    private double width = 0;

    @Override
    public double AreaBehaviour()
    {
        return this.length * this.width;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    //NOTICE:    
    //GETTERS ARE NOT NECESSARY IN THIS EXAMPLE,
    //THATS WHY, WE DO NOT HAVE THEM HERE.
}
