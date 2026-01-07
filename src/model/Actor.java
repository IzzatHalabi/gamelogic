package model;

import dimension.Dimension;
import dimension.Dimensionable;
import movable.Movable;
import position.Position;

public class Actor implements Movable, Dimensionable {

    private Position position;
    private Dimension dimension;

    public Actor() {
        this.position = new Position(0, 0);
        this.dimension = new Dimension(0, 0);
    }

    @Override
    public Position getPosition() { return this.position; }
    @Override
    public void setPosition(Position position) { this.position = position; }

    @Override
    public Dimension getDimension() { return this.dimension; }
    @Override
    public void setDimension(Dimension dimension) { this.dimension = dimension; }
    
}
