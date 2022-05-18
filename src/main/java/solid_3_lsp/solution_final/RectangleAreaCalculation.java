package solid_3_lsp.solution_final;

import lombok.Setter;

@Setter
public class RectangleAreaCalculation extends PolygonAreaCalculationAbstraction {

    private double length = 0;
    private double width = 0;

    @Override
    public double AreaBehaviour()
    {
        return this.length * this.width;
    }
}