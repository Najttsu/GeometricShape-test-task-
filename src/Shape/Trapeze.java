package Shape;
import Enum.*;

public class Trapeze extends Figure{
    private double a = randomNumber();
    private double b = randomNumber();
    private double h = randomNumber();
    private String name = Shape.TRAPEZE.getFigureName();
    private String color = Color.randomColorName();

    @Override
    public String info() {
        return "Figure:\t" + name +
                "\nSide A:\t" + round(a) +
                "\nSide B:\t" + round(b) +
                "\nHeight:\t" + round(h) +
                "\nColor:\t" + color +
                "\nSquare:\t" + round(square()) +
                "\n";
    }


    @Override
    public double square() {
        return ((a + b) / 2) * h;
    }
}
