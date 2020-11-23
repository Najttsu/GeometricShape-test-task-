package Factory;

import Shape.Figure;
import Shape.Triangle;

public class TriangleFactory implements FigureFactory{
    @Override
    public Figure createFigure() {
        return new Triangle();
    }
}
