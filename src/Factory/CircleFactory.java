package Factory;

import Shape.Circle;
import Shape.Figure;

public class CircleFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new Circle();
    }
}
