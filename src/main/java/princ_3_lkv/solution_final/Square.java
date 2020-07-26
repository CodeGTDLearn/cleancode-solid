package princ_3_lkv.solution_final;

public class Square extends AbstractAreaPolygon {

    private double side = 0;

    @Override
    public double AreaBehaviour()
    {
        return Math.pow(side, 2);
    }

    public void setSide(double side)
    {
        this.side = side;
    }

    //NOTICE:    
    //GETTERS ARE NOT NECESSARY IN THIS EXAMPLE,
    //THATS WHY, WE DO NOT HAVE THEM HERE. 
}
