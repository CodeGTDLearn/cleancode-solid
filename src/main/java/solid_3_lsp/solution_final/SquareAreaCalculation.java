package solid_3_lsp.solution_final;

import lombok.Setter;

@Setter
public class SquareAreaCalculation extends PolygonAreaCalculationAbstraction {

    private double side = 0;

    @Override
    public double AreaBehaviour()
    {
        return Math.pow(side, 2);
    }
}