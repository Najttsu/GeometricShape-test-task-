package Shape;
import Enum.*;

public class Triangle extends Figure{
    private double a = randomNumber();
    private double b = randomNumber();
    private double c = getHypotenuse();
    private String name = Shape.TRIANGLE.getFigureName();
    private String color = Color.randomColorName();


    @Override
    public double square() {
        double p = (a + b + c) / 2 ;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    public double getHypotenuse(){
        double c = Math.sqrt((a * a ) + (b * b));
        return c;
    }

    @Override
    public String info() {
        return "Figure:\t" + name +
                "\nHypotenuse:\t" + round(c) +
                "\nColor:\t" + color +
                "\nSquare:\t" + round(square()) +
                "\n";
    }
}
