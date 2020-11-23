package Factory;

import Shape.Figure;
import Shape.RegularTetragon;

public class RegularTetragonFactory implements FigureFactory {
    @Override
    public Figure createFigure() {
        return new RegularTetragon();
    }
}
