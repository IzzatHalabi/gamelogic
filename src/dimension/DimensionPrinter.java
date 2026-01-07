package dimension;

public class DimensionPrinter {

    public static void print(Dimension dimension) {
        System.out.println("Dimension (width,height): (" + dimension.getWidth() + "," + dimension.getHeight() + ")");
    }

    public static void print(Dimensionable dimensionable) {
        print(dimensionable.getDimension());
    }

}