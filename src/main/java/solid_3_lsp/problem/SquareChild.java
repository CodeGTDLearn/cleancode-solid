package solid_3_lsp.problem;

import lombok.Setter;

@Setter
public class SquareChild extends RectangleParent {

    private double side = 0;

    @Override
    public double areaBehaviourRectangle()
    {
        super.setLength(this.side);
        super.setWidth(this.side);

        return super.areaBehaviourRectangle();
    }
}