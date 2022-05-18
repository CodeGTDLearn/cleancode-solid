package solid_3_lsp.problem;

import lombok.Setter;

@Setter
public class RectangleParent {

    private double length = 0;
    private double width = 0;

    public double areaBehaviourRectangle()
    {
        return length * width;
    }
}