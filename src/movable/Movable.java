package movable;

import position.Position;
import position.Positionable;

public interface Movable extends Positionable {

    public enum Direction { X, Y };

    default void move(Direction direction, int distance) {
        Position position = this.getPosition();
        if (direction == Direction.X) {
            position.setX(position.getX() + distance);
        } else if (direction == Direction.Y) {
            position.setY(position.getY() + distance);
        }
    }

    default void move(Position position) {
        this.move(Direction.X, position.getX());
        this.move(Direction.Y, position.getY());
    }
    
}
