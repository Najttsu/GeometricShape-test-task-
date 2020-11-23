package Shape;

import Enum.*;

public class RegularTetragon extends Figure {
    private double side = randomNumber();
    private String name = Shape.REGULAR_TETRAGON.getFigureName();
    private String color = Color.randomColorName();

    @Override
    public String info() {
        return "Figure:\t" + name +
                "\nSide:\t" + round(side) +
                "\nColor:\t" + color +
                "\nSquare:\t" + round(square()) +
                "\n";
    }

    @Override
    public double square() {
        return side *= side;
    }
}
