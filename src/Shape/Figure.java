package Shape;

import java.text.DecimalFormat;

public abstract class Figure {

    public abstract double square();
    public abstract String info();

    static double randomNumber() {
        int min = 1;
        int max = 100;
        double scale = Math.pow(10, 1);
        return Math.ceil(scale * ((Math.random() * max) + min)) / scale;
    }

    static String round(double number){
        String formattedNumber = new DecimalFormat("#.#").format(number);
        return formattedNumber;
    }
}
