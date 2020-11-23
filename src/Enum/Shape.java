package Enum;

public enum Shape {
    CIRCLE("Circle"),
    REGULAR_TETRAGON("Regular tetragon"),
    TRIANGLE("Triangle"),
    TRAPEZE("Trapeze");

    private String name;

    Shape(String name) {
        this.name = name;
    }

    public String getFigureName() {
        return name;
    }

    private static int randomArrIndex(int arrLength) {
        int min = 0;
        int max = arrLength ;
        return  (int) (Math.random() * max) + min;
    }

    public static String randomShapeName(){
        Shape[] arr = Shape.values();
        return arr[randomArrIndex(arr.length)].getFigureName();
    }

}
