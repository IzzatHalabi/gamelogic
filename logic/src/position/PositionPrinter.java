package position;

public class PositionPrinter {
    
    public static void print(Position position) {
        System.out.println("Position (x,y): (" + position.getX() + "," + position.getY() + ")");
    }

    public static void print(Positionable positionable) {
        print(positionable.getPosition());
    }

}
