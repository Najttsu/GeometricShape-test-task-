package Shape;

import Enum.*;

public class Circle extends Figure {
    private double radius = randomNumber();
    private String name = Shape.CIRCLE.getFigureName();
    private String color = Color.randomColorName();

    @Override
    public double square() {
        double PI = Math.PI;
        return PI * (radius * radius);
    }

    @Override
    public String info() {
        return "Figure:\t" + name +
                "\nRadius:\t" + round(radius) +
                "\nColor:\t" + color +
                "\nSquare:\t" + round(square()) +
                "\n";
    }
}
