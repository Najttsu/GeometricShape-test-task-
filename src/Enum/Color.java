package Enum;

public enum Color {
    RED("Red"),
    BLUE("Blue"),
    BLACK("Black"),
    WHITE("White"),
    PINK("Pink"),
    YELLOW("Yellow");

    private String name;

    Color(String name) {
        this.name = name;
    }

    public String getFigureColor() {
        return name;
    }

    private static int randomArrIndex(int arrLength) {
        int min = 0;
        int max = arrLength ;
        return  (int) (Math.random() * max) + min;
    }

    public static String randomColorName(){
        Color[] arr = Color.values();
        return arr[randomArrIndex(arr.length)].getFigureColor();
    }
}
