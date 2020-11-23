import Factory.*;
import Shape.Figure;
import Enum.*;

public class Main {
    public static void main(String[] args) {
        int randomIndex = (int)(Math.random() * 10) + 1;
        Figure[] arrFigure = new Figure[randomIndex];

        for (int i = 0; i < arrFigure.length; i++) {
            String shape = Shape.randomShapeName(); // get random name of figure
            arrFigure[i] = createFigure(shape); // add to arr figure
            System.out.println(arrFigure[i].info());
        }
    }

    public static Figure createFigure(String shape){
        FigureFactory figureFactory;
        Figure figure = null;
        switch (shape){
            case "Regular tetragon": figureFactory = new RegularTetragonFactory();
            figure = figureFactory.createFigure();
            break;
            case "Circle": figureFactory = new CircleFactory();
            figure = figureFactory.createFigure();
            break;
            case "Triangle": figureFactory = new TriangleFactory();
            figure = figureFactory.createFigure();
            break;
            case "Trapeze": figureFactory = new TrapezeFactory();
            figure = figureFactory.createFigure();
        }
        return figure;
    }
}
