package position;

public interface Positionable {

    Position getPosition();
    void setPosition(Position position);

    default void setPosition(int x, int y) {
        this.setPosition(new Position(x, y));
    }
    
}
