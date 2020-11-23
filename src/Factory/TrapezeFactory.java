package Factory;

import Shape.Figure;
import Shape.Trapeze;

public class TrapezeFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new Trapeze();
    }
}
